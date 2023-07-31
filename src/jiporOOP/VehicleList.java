package jiporOOP;
public class VehicleList {
    //data members
    private Vehicle[] vl;
    private int listLength;
    private int size;
    //create constructors
    public VehicleList(){
        this.size = 50;
        this.listLength = 0;
        this.vl = new Vehicle[this.size];
    }
    public VehicleList(int size){
        this.size = size;
        this.listLength = 0;
        this.vl = new Vehicle[this.size];
    }
    public VehicleList(String vcode, String mcode, String fcode, String my, String model, String color){
        this.size = size;
        this.listLength = 0;
        this.vl = new Vehicle[this.size];
        this.vl[this.listLength++] = new Vehicle(vcode, mcode, fcode, my, model, color);
    }
    public VehicleList(String vcode, String mcode, String fcode, String my, String model, String color, int size){
        this.size = size;
        this.listLength = 0;
        this.vl = new Vehicle[this.size];
        this.vl[this.listLength] = new Vehicle();
        this.vl[this.listLength].setVcode(vcode);
        this.vl[this.listLength].setMcode(mcode);
        this.vl[this.listLength].setFcode(fcode);
        this.vl[this.listLength].setMy(my);
        this.vl[this.listLength].setModel(model);
        this.vl[this.listLength].setColor(color);
        this.listLength++;
    }
    //create method addItem
    public void addItem(Vehicle v){
        if (this.listLength < this.size){
        //instantiate or create array element to object
                    Vehicle[] temp = new Vehicle[this.size];
            for(int i=0; i<this.listLength; i++)
                temp[i] = this.vl[i];
            this.size *= 2;
            this.vl = new Vehicle[this.size];
            for(int i=0; i<this.listLength; i++)
                this.vl[i] = temp[i];
        }
        this.vl[this.listLength] = new Vehicle();
        this.vl[this.listLength++] = v;
    }
    public void deleteItem(String vcode){
        for(int i = 0; i<this.listLength; i++){
            if(this.vl[i].getVcode().equalsIgnoreCase(vcode)){
                for(int j =i; j<this.listLength -1;j++)
                    this.vl[j]=this.vl[j+1];
                this.vl[--this.listLength] = null;
                System.out.println("Item is deleted successful....");
                return;
            }
        }
        System.out.println("this item is not found....");
    }
    public void updateItem(String vcode, Vehicle v){
        for (int i = 0; i<this.listLength; i++){
            if(this.vl[i].getVcode().equalsIgnoreCase(vcode)){
                this.vl[i] = v;
                System.out.println("Item is updated successful....");
                return;
            }
        }
        System.out.println("Item is not found....");
    }
    public Vehicle getSearch(String vcode){
        for (int i = 0; i<this.listLength; i++){
            if(this.vl[i].getVcode().equalsIgnoreCase(vcode)){
                return this.vl[i];
            }
        }
        return null;
    }
    public void showListInfo(){
        System.out.printf("%10s%10s%10s%10s%10s%10s\n",
        "Vcode",
        "Mcode",
        "Fcode",
        "Make Year",
        "Model",
        "Color");
        System.out.println("---------------------------------");
        for(int i = 0; i<this.listLength; i++){
            
        }
    }
}




