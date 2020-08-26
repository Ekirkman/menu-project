package restraurant;

public class MenuItem {
        private String name;
        private String description;
        private double price;
        private String category;
        private boolean isNew;
        private boolean isVegan;


        public MenuItem(String name,String  description, int price, String category, boolean  isVegan){
            this.name = name;
            this.description = description;
            this.price = price;
            this.category = category;
            this.isVegan = isVegan;
            this.isNew = true;
        }

    }




