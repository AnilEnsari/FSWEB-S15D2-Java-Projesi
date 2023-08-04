package SetChallenge;

import ENUMS.Arguments;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TaskData {

    Set<Task> annsTasks;
    Set<Task> bobsTasks;
    Set<Task> carolsTaks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTaks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTaks = carolsTaks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public void setAnnsTasks(Set<Task> annsTasks) {
        this.annsTasks = annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public void setBobsTasks(Set<Task> bobsTasks) {
        this.bobsTasks = bobsTasks;
    }

    public Set<Task> getCarolsTaks() {
        return carolsTaks;
    }

    public void setCarolsTaks(Set<Task> carolsTaks) {
        this.carolsTaks = carolsTaks;
    }

    public Set<Task> getTasks(Arguments arguments) {

        if (arguments.equals(Arguments.ANN)) {

            return annsTasks;

        } else if (arguments.equals(Arguments.BOB)) {

            return bobsTasks;

        } else if (arguments.equals(Arguments.CAROL)) {

            return carolsTaks;

        } else if (arguments.equals(Arguments.ALL)) {
            Set<Task> totalTasks = new HashSet<>();
            totalTasks.addAll(annsTasks);
            totalTasks.addAll(bobsTasks);
            totalTasks.addAll(carolsTaks);

            return totalTasks ;

        } else System.out.println("Please enter an valid enum of Arguments!");
        return null;

    }
 public Set<Task> getUnion(Set<Task> settask1, Set<Task> settask2) {

     Set<Task> unionTask = new HashSet<>(settask1);
     unionTask.addAll(settask2);
        return unionTask;
 }
    public Set<Task> getIntersect(Set<Task> settask1, Set<Task> settask2) {

        Set<Task> intersectTask = new HashSet<>(settask1);
        intersectTask.retainAll(settask2);
        return intersectTask;
    }
    public Set<Task> getDifference(Set<Task> settask1, Set<Task> settask2) {

        Set<Task> diffTask = new HashSet<>(settask1);
        diffTask.removeAll(settask2);
        return diffTask;
    }

    }
