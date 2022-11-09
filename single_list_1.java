package single_list;

import java.util.Scanner;

public class single_list_1 {
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
	Scanner sc=new Scanner(System.in);
	public void creation()
	{
		int data,n;
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
			System.out.print("Press 1 For Insert ");
			n=sc.nextInt();
		}while(n==1);
	}
	public void insertAtEnd()
	{
		int data,n;
		do
		{
			System.out.print("Enter Data ");
			data=sc.nextInt();
			Node new_node=new Node(data);
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new_node;
			new_node.next=null;
			System.out.print("Press 1 For Insert ");
			n=sc.nextInt();
		}while(n==1);
	}
	public void insertAtIndex()
	{
		int data,index,length=0,n;
		do
		{
			System.out.print("Enter Data ");
			data=sc.nextInt();
			System.out.print("Enter Index ");
			index=sc.nextInt();
			Node temp=head;
			while(length!=index-1)
			{
				temp=temp.next;
				length++;
			}
			Node new_node=new Node(data);
			Node prev=temp.next;
			temp.next=new_node;
			new_node.next=prev;
			System.out.print("Press 1 For Insert ");
			n=sc.nextInt();
		}while(n==1);
	}
	public void traverser()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.print("List Empty");
		}
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.data+"\n");
				temp=temp.next;
			}
		}
	}
	public static void main(String args[])
	{
		single_list_1 sl=new single_list_1();
		sl.creation();
		int c;
		while(true)
		{
			System.out.print("\nChoose 1 For Insert At Start ");
			System.out.print("\nChoose 2 For Insert At End ");
			System.out.print("\nChoose 3 For Insert At Index ");
			System.out.print("\nChoose 4 For Display Data ");
			Scanner sc=new Scanner(System.in);
			c=sc.nextInt();
			if(c==1)
			{
				sl.creation();
			}
			else if(c==2)
			{
				sl.insertAtEnd();
			}
			else if(c==3)
			{
				sl.insertAtIndex();
			}
			else if(c==4)
			{
				sl.traverser();
			}
			else
			{
				break;
			}
		}
	}
}