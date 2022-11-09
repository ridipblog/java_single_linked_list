package single_list;

import java.util.Scanner;

public class single_list_deletion {
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
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			Node new_node=new Node(data);
			new_node.next=null;
			temp.next=new_node;
			System.out.print("Press 1 For Insert ");
			n=sc.nextInt();
		}while(n==1);
	}
	public void insertAtIndex()
	{
		int data,index,n,length=0;
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
	public void deletAtStart()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.print("List Null ");
		}
		else
		{
			head=temp.next;
		}
	}
	public void deleteAtEnd()
	{
		if(head==null)
		{
			System.out.print("List Null ");
		}
		else
		{
			if(head.next==null)
			{
				deletAtStart();
			}
			else
			{
				Node temp=head;
				Node prev=temp.next;
				while(prev.next!=null)
				{
					temp=prev;
					prev=prev.next;
				}
				temp.next=null;
			}
		}
	}
	public void deleteAtIndex()
	{
		Node temp=head;
		Node prev=null;
		int index,length=0;
		System.out.print("Enter Index ");
		index=sc.nextInt();
		if(index==1)
		{
			deletAtStart();
		}
		else
		{
			while(length!=index-1)
			{
				prev=temp;
				temp=temp.next;
				length++;
			}
			prev.next=temp.next;
		}
	}
	public void traversal()
	{
		if(head==null)
		{
			System.out.print("List Null");
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
		single_list_deletion sl=new single_list_deletion();
		sl.creation();
		int c;
		while(true)
		{
			System.out.print("\nChoose 1 For Insert At Start ");
			System.out.print("\nChoose 2 For Insert At End ");
			System.out.print("\nChoose 3 For Insert At Index ");
			System.out.print("\nChoose 4 For Display Data ");
			System.out.print("\nChoose 5 For Delete At Start ");
			System.out.print("\nChoose 6 For Delete At End ");
			System.out.print("\nChoose 7 For Delete At Index ");
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
				sl.traversal();
			}
			else if(c==5)
			{
				sl.deletAtStart();
			}
			else if(c==6)
			{
				sl.deleteAtEnd();
			}
			else if(c==7)
			{
				sl.deleteAtIndex();
			}
			else
			{
				break;
			}
		}
		
	}
}