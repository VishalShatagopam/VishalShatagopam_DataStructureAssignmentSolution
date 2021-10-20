package com.greatlearning.covertBstToSkewed;

public class SkewedConversion {
	
	static class Node {
		int key;
		Node left;
		Node right;

	}
	static Node newNode(int data) {
		Node temp = new Node();

		temp.key = data;	
		temp.left = null;
		temp.right = null;

		return temp;
	}

	static Node prevNode = null;
	static Node headNode = null;
	
	static void bSTToSkewed(Node root, int order)
	{

		if(root == null)
		{
			return;
		}
		if(order > 0)
		{
			bSTToSkewed(root.right, order);
		}
		else
		{
			bSTToSkewed(root.left, order);
		}
		Node rightNode = root.right;
		Node leftNode = root.left;

		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		if (order > 0)
		{
			bSTToSkewed(leftNode, order);
		}
		else
		{
			bSTToSkewed(rightNode, order);
		}
	}


	static void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.key + " ");
		traverseRightSkewed(root.right);       
	}

	public static void main(String args[]) {
		Node root = new Node();
		root = newNode(50);
		root.left = newNode(30);
		root.right = newNode(60);
		root.right.left = newNode(40);	
		root.left.left = newNode(10);
		//Converted to BST tree using hard coded values
		root = newNode(50);
		root.left = newNode(30);
		root.right = newNode(60);
		root.left.right = newNode(40);	
		root.left.left = newNode(10);	
		int order = 0;
		bSTToSkewed(root, order);
		traverseRightSkewed(headNode);
	}

}

