package Model;

public class loan {
    
    private int tool_id;
    private int id_friend;
    private boolean status;
    
    public loan(int tool_id, int id_friend, boolean status) {
        this.tool_id = tool_id;
        this.id_friend = id_friend;
        this.status = status;
    }

    public int getTool_id() {
        return tool_id;
    }

    public void setTool_id(int tool_id) {
        this.tool_id = tool_id;
    }

    public int getId_friend() {
        return id_friend;
    }

    public void setTel(int id_friend) {
        this.id_friend = id_friend;
    }
    
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
