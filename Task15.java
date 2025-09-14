import java.util.List;
import java.util.ArrayList;

class Component {
    private String id;
    private boolean enabled = true;
    private List<Component> children = new ArrayList<>();

    public Component(String id) {
        this.id = id;
    }

    public void add(Component component) {
        children.add(component);
    }



    public List<Component> getChildren() {
        return children;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        System.out.println("Component " + id + " set to " + (enabled ? "enabled" : "disabled"));
    }
}

class ComponentManager {
    /**
     * TO-DO: Refactor this iterative method into a recursive one.
     \*
     * This method disables a component and all of its descendants. The current
     * implementation uses a Queue to perform a breadth-first traversal.
     \*
     * @param root The component to start with.
     */
public void disableAll(Component root){
    if (root == null)
        return;
    root.setEnabled(false);
    for(Component child : root.getChildren()){
        disableAll(child);
        }
    }
}