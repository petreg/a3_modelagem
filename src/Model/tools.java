package Model;

public class tools{

    private String name;
    private String mark;
    private int cost;
    
    public tools(String name, int cost,String mark) {
        this.name = name;
        this.mark = mark;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    
    public String getMark(){
        return mark;
    }
    
    public void setMark(String mark){
        this.mark = mark;
    }
       
}
