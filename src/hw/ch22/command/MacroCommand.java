package hw.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 명령의 배열 
    private Deque<Command> commands = new ArrayDeque<>();
    private Deque<Command> commands2 = new ArrayDeque<>();

    private Iterator<Command> it = commands.descendingIterator();
    private Iterator<Command> it2 = commands2.descendingIterator();

    // 실행 
    @Override
    public void execute() {
        // for (Command cmd: commands) {
        //     cmd.execute();
        // }
        while (it.hasNext()) {
            it.next().execute();
        }
    }

    // 추가 
    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.isEmpty()) {
            commands2.add(commands.pop());
        }
    }

    // 전부 삭제 
    public void clear() {
        commands.clear();
    }
}
