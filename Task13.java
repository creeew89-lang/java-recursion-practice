public class Category {
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category deepClone() {
        return new Category(this.name);
    }
}
    class Product {
        private int id;
        private Category category;

        public Product(int id, Category category) {
            this.id = id;
            this.category = category;
        }

        public int getId() {
            return id;
        }

        public Category getCategory() {
            return category;
        }

        public void setCategory(Category category) {
            this.category = category;
        }

        /**
         * TO-DO: Implement this method using recursion principles.
         \*
         * This method should create a deep copy of the Product object. This means
         * it must also create a new instance of the Category object.
         * Imagine a scenario where Category could contain other objects that also need cloning.
         * A recursive approach is ideal for such deep-copying tasks.
         \*
         * @return A new Product object with all its contained objects also newly created.
         */
  public Product deepClone(){
  Category clonedCategory = this.category != null ? this.category.deepClone() : null;
  return new Product(this.id, clonedCategory);
  }
    }