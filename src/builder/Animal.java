package builder;

public class Animal {
    private String type;
    private String name;
    private int age;
    private String owner;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }

    private Animal(Builder builder) {
        this.type = builder.type;
        this.name = builder.name;
        this.age = builder.age;
        this.owner = builder.owner;
    }

    public static class Builder {

        private String type;
        private String name;
        private int age;
        private String owner;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }

    @Override
    public String toString() {
        return "Animal [type=" + type + ", name=" + name + ", age=" + age + ", owner=" + owner + "]";
    }
}
