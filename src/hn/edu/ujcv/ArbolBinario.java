package hn.edu.ujcv;

public class ArbolBinario {
    private Nodo root;

    public boolean isEmpty(){
        if(root == null){
            return true;
        }
        return false;
    }

    public void add(int dato){
        if(isEmpty()){
            root = new Nodo(dato);
        }else {
            root.add(dato);
        }
    }


   public boolean find(int dato){
        if(!isEmpty()){
           return root.find(dato);
        }
        return false;
   }

   public String toString(){
        if(isEmpty()){
            return "";
        }
        return this.preOrder();
   }

    private String preOrder() {
        return root.preOrder();
    }

    private class Nodo {
        private int dato;
        private Nodo hijoIz;
        private Nodo hijoDer;



        public Nodo(int dato){this.dato = dato;}

        public void add(int dato){
          if(dato > this.dato){
              // va a la derecha
              if(hijoDer == null){
                  hijoDer = new Nodo(dato);
              }else{
                  hijoDer.add(dato);
              }
          }  else{
              //va a la Izquierda
              if(hijoIz == null){
                  hijoIz = new Nodo(dato);
              }else{
                  hijoIz.add(dato);
              }
          }
        }

        public int getDato() {
            return dato;
        }

        public void setDato(int dato) {
            this.dato = dato;
        }

        public Nodo getHijoIz() {
            return hijoIz;
        }

        public void setHijoIz(Nodo hijoIz) {
            this.hijoIz = hijoIz;
        }

        public Nodo getHijoDer() {
            return hijoDer;
        }

        public void setHijoDer(Nodo hijoDer) {
            this.hijoDer = hijoDer;
        }

        public boolean find(int  dato) {
            if(this.dato == dato){
                return true;
            }
            if(this.dato < dato){
                if(hijoDer == null){
                    return false;
                }
                return hijoDer.find(dato);

            }else{
                if(hijoIz == null){
                    return false;
                }
                return hijoIz.find(dato);
            }
        }

        public String preOrder() {
            return ""+this.dato +
                    (hijoIz == null?"":", "+hijoIz.preOrder()) +
                    (hijoDer == null ?"":", "+hijoDer.preOrder());
        }

        @Override
        public String toString() {
            return preOrder();
        }
    }
}
