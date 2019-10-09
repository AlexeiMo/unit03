package by.epam.java_intro.classes;
import java.util.LinkedList;
import java.util.List;

public class TrainDepo {
    List<Train> list;

    public TrainDepo() {
        this.list = new LinkedList<>();
    }
    public TrainDepo(List<Train> list) {
        this.list = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            this.list.add(list.get(i));
        }
    }

    public void setList(List<Train> list) {
        for (int i = 0; i < list.size(); i++) {
            this.list.add(list.get(i));
        }
    }

    public List<Train> getList() {
        return this.list;
    }

    public void addTrain(Train train) {
        this.list.add(train);
    }
    public Train removeTrain() {
        Train train = this.list.remove(list.size()-1);
        return train;
    }
}
