package com.topalgo;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

// Node class representing each character in the Huffman Tree
class HuffmanNode {
    int frequency;
    char data;
    HuffmanNode left, right;

    HuffmanNode(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }
}

// Comparator class for the priority queue
class MyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.frequency - y.frequency;
    }
}

public class HuffmanCompression {

    // Recursive function to print the Huffman codes and store them in a map
    public static void printCode(HuffmanNode root, String s, Map<Character, String> huffmanCode) {
        if (root == null) {
            return;
        }

        // Leaf node: contains a character
        if (root.left == null && root.right == null) {
            huffmanCode.put(root.data, s);
            System.out.println(root.data + ": " + s);
            return;
        }

        // Recur for left and right children with added '0' or '1' to the code
        printCode(root.left, s + "0", huffmanCode);
        printCode(root.right, s + "1", huffmanCode);
    }

    // Function to build the Huffman Tree and generate codes
    public static void main(String[] args) {
        String text = "Huffman coding is a data compression algorithm.";

        // Count frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Create a priority queue to store live nodes of Huffman Tree
        PriorityQueue<HuffmanNode> queue = new PriorityQueue<>(frequencyMap.size(), new MyComparator());

        // Create a leaf node for each character and add it to the priority queue
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            queue.add(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        // Iterate until the queue contains only one node (the root)
        HuffmanNode root = null;
        while (queue.size() > 1) {
            // Remove the two nodes with the lowest frequency
            HuffmanNode x = queue.poll();
            HuffmanNode y = queue.poll();

            // Create a new internal node with a frequency equal to the sum of the two nodes' frequencies
            HuffmanNode f = new HuffmanNode('-', x.frequency + y.frequency);
            f.left = x;
            f.right = y;

            // Add this node to the priority queue
            root = f;
            queue.add(f);
        }

        // Print the Huffman codes
        Map<Character, String> huffmanCode = new HashMap<>();
        printCode(root, "", huffmanCode);

        // Encode the input text using the generated codes
        StringBuilder encodedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encodedText.append(huffmanCode.get(c));
        }
        System.out.println("Encoded Text: " + encodedText.toString());

        // Decode the encoded text
        StringBuilder decodedText = new StringBuilder();
        HuffmanNode currentNode = root;
        for (int i = 0; i < encodedText.length(); i++) {
            currentNode = encodedText.charAt(i) == '0' ? currentNode.left : currentNode.right;

            // If it's a leaf node, append the character to the decoded text
            if (currentNode.left == null && currentNode.right == null) {
                decodedText.append(currentNode.data);
                currentNode = root; // Reset to start decoding the next character
            }
        }
        System.out.println("Decoded Text: " + decodedText.toString());
    }
}
