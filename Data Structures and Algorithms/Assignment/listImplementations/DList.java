/*****************************************************
 * Author = ar2-nutt 
 * Student ID = 11004967 
 * File = DList.java
 ****************************************************/
package listImplementations;

public class DList<item> {

  private DNode firstNode = new DNode(null);
  private int currentLength = 0;

  public boolean contains(item aStudent) {
    boolean found = false;
    DNode currentNode = firstNode;

    if (!isEmpty()) {
      for (int i = 0; i < currentLength; i++) {
        if (currentNode.getItem() == aStudent) {
          found = true;
          i = currentLength;
        } else {
          currentNode = currentNode.getNext();
        }
      }//for(currentLength)
    }//if(isEmpty())
    return found;
  }

  public void add(item aStudent) {
    if (!contains(aStudent)) {
      DNode node = new DNode(aStudent, firstNode);
      firstNode = node;
      currentLength++;
    }
  }

  public int indexOf(item aStudent) {
    int val = -1;
    DNode currentNode = firstNode;

    if (!isEmpty()) {
      for (int i = 0; i < currentLength; i++) {
        if (currentNode.getItem() == aStudent) {
          val = i;
        }
        currentNode = currentNode.getNext();
      }//for(currentLength)
    }//if(isEmpty())
    return val;
  }

  public item get(int index) {
    DNode currentNode = firstNode;

    for (int i = 0; i < index; i++) {
      currentNode = currentNode.getNext();
    }
    return (item) currentNode.getItem();
  }

  public int size() {
    return currentLength;
  }

  public boolean isEmpty() {
    if (currentLength == 0) {
      return true;
    } else {
      return false;
    }
  }

  public int getCurrentLength() {
    return currentLength;
  }
}//DList.java