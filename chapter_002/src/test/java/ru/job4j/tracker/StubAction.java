package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Consumer;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class StubAction implements UserAction {
    private boolean call = false;

    @Override
    public String name() {
        return "Stub action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }

    @Test
    public void whenExit() {
        StubInput input = new StubInput(
                new String[] {"0"}
        );
        StubAction action = new StubAction();
        ArrayList<UserAction> stubAction = new ArrayList<>();
        stubAction.add(action);
        new StartUI().init(input, new Tracker(), stubAction, System.out::println);
        assertThat(action.isCall(), is(true));
    }
}
