package duke;

public class Task{
    protected String description;
    
    public Task(String description){
        this.description = description;
    }
    
    public void setDescription(String description){
       this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
