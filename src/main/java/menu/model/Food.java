package menu.model;

public record Food(String name) {

    public Food {
        validate(name);
    }

    private void validate(String name) {
        Menu.existsFood(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
