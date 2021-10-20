/*...5 lines*/
package fes.aragon.unam.adts;

/**...4 lines */
public class doublelinked {
   
    private class NodoDoble<T>{
        T data;
        NodoDoble next;
        NodoDoble prev;
        
        public NodoDoble() {         
        }
       
        public NodoDoble(T data, NodoDoble next, NodoDoble prev) {
            this.data = data;
            this.next = next;
            this.prev = prev; 
        }
        
    }
                
        private NodoDoble head;
        private NodoDoble tail;
        
        public DoubleLinkedList() {
            head = null;
            tail = null;
        }
        
        public boolean siEmpty(){
             return this.head ==null;
        }
        
        public void append{ Object valor }{
            if( this.tail == null){
                this.tail = new NodoDoble(valor, null, null);
                this.head = this.tail;
            }else{
                this.tail.next = new NodoDoble(valor, null , this.tail);
            }
        }
    }
    
    public void transversal(){
         NodoDoble currNode = this.head;
         while( currNode != null ){
             System.out.print(currNode.data + "-->");
             currNode = currNode.next;
         }
    }
    
    
}
