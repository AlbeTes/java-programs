import java.util.ArrayList;
import java.util.List;

class TradeLibrary<T extends TradeEntity> {
    private List<T> entities = new ArrayList<>();

    public void addEntity(T entity) {
        entities.add(entity);
    }

    public void removeEntity(T entity) {
        entities.remove(entity);
    }

    public List<T> getAllEntities() {
        return entities;
    }

    public void displayEntities() {
        for (T entity : entities) {
            System.out.println(entity.getName());
        }
    }
}