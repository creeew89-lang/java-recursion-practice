import java.util.List;

class Item {
    private int value;

    public Item(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class Container {
    private Item item;
    private List<Container> containers;

    public Container(Item item) {
        this.item = item;
        this.containers = null;
    }

    public Container(List<Container> containers) {
        this.item = null;
        this.containers = containers;
    }

    public boolean isItem() {
        return item != null;
    }

    public Item getItem() {
        return item;
    }

    public List<Container> getContainers() {
        return containers;
    }
}

class ValueCalculator {
    /**
     * TO-DO: Convert this method to be recursive.
     \*
     * This method sums the value of all Items within a nested container structure.
     * The current approach uses a Stack for an iterative, depth-first traversal.
     \*
     * @param container The top-level container.
     * @return The sum of all values.
     */
    public int calculateTotalValue(Container container) {
if(container == null)
    return 0;
if(container.isItem()){
    return container.getItem().getValue();
        }
int total = 0;
List<Container> nested = container.getContainers();
if (nested != null) {
    for (Container sub : nested) {
        total += calculateTotalValue(sub);
    }
}
        return total;
    }
}