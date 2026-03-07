package eu.ase.poli;
    public class vehicle implements movement{
        private int weight;

        public vehicle(){

        }
        public vehicle(int weight){
            this.weight=weight;
        }
        public String display(){
            return new String("vehicle-weight: "+this.weight);
        }
        @Override
        public void startEngine(){
            System.out.println("Vehicle:: startEngine()");
        }
        @Override
        public void stopEngine(){
            System.out.println("Vehicle:: stopEngine()");
        }
        @Override
        public Object clone() throws CloneNotSupportedException{
            return (vehicle) super.clone();
        }

        public int getWeight(){
            return this.weight;
        }
    }

