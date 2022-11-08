package single_list;

import java.util.Scanner;

public class single_list
{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	public void creation()
	{
		int data,n;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.print("Enter Data ");
			data=sc.nextInt();
			Node new_node=new Node(data);
			if(head==null)
			{
				head=new_node;
			}
			else
			{
				new_node.next=head;
				head=new_node;
			}
			System.out.print("Press 1 For Insert More ");
			n=sc.nextInt();
		}while(n==1);
	}
	public void traverser()
	{
		if(head==null)
		{
			System.out.print("Linked List Null");
		}
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"\n");
				temp=temp.next;
			}
		}
	}
	public static void main(String args[])
	{
		single_list sl=new single_list();
		sl.creation();
		sl.traverser();
	}
}