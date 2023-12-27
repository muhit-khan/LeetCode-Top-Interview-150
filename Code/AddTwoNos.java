/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
	public SinglyLinkedListNode addTwoNumbers(SinglyLinkedListNode l1, SinglyLinkedListNode l2) {
		
		SinglyLinkedListNode answerHead = null;
		SinglyLinkedListNode answerTail = null;
		int carry = 0;
		
		while(l1 != null && l2 != null)
		{
		    int sum = l1.data + l2.data + carry; 
		    int value = sum%10; 
		    carry = sum/10;
		    
		    SinglyLinkedListNode newNode = new SinglyLinkedListNode(value);
		    if(answerHead == null && answerTail == null)
		    {
		        answerHead = newNode;
		        answerTail = newNode;
		    }
		    else 
		    {
		        answerTail.next = newNode;
		        answerTail = answerTail.next; 
		    }
		    
		    l1 = l1.next;
		    l2 = l2.next;
		}
		
		while(l1 != null)
		{
		    int sum = l1.data + carry;
		    int value = sum%10; 
		    carry = sum/10;
		    
		    SinglyLinkedListNode newNode = new SinglyLinkedListNode(value);
		    if(answerHead == null && answerTail == null)
		    {
		        answerHead = newNode;
		        answerTail = newNode;
		    }
		    else 
		    {
		        answerTail.next = newNode;
		        answerTail = answerTail.next; 
		    }
		    
		    l1 = l1.next;
		}
		
		while(l2 != null)
		{
		    int sum = l2.data + carry;
		    int value = sum%10; 
		    carry = sum/10;
		    
		    SinglyLinkedListNode newNode = new SinglyLinkedListNode(value);
		    if(answerHead == null && answerTail == null)
		    {
		        answerHead = newNode;
		        answerTail = newNode;
		    }
		    else 
		    {
		        answerTail.next = newNode;
		        answerTail = answerTail.next; 
		    }
		    
		    l2 = l2.next;
		}
		
		if(carry == 1)
		{
		    SinglyLinkedListNode newNode = new SinglyLinkedListNode(carry);
		    answerTail.next = newNode;
		    answerTail = answerTail.next;
		}
		
		return answerHead;
	}
}