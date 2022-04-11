package ua.nure.second.main;

import ua.nure.second.implOfCommand.Command;
import ua.nure.second.implOfCommand.*;

import java.util.*;

public class BrainfuckCompiler {
    private Map<Character, InstructionProcessor> processors = new HashMap<>();
    public BrainfuckCompiler(){
        processors.put('+', operationalStack -> operationalStack.peek().add(new Plus()));
        processors.put('-', operationalStack -> operationalStack.peek().add(new Minus()));
        processors.put('>', operationalStack -> operationalStack.peek().add(new NextCell()));
        processors.put('<', operationalStack -> operationalStack.peek().add(new PreviousCell()));
        processors.put('.', operationalStack -> operationalStack.peek().add(new Print()));

        processors.put('[', operationalStack ->   operationalStack.push(new LinkedList<>()));
        processors.put(']', operationalStack -> {
            List<Command> innerCommands = operationalStack.pop();
            operationalStack.peek().add(new Loop(innerCommands));
        });
    }


    public List<Command> compile (String brainfuckProgram){
        Deque<List<Command>> operationalStack = new ArrayDeque<>();
        operationalStack.push(new ArrayList<>());
        for(char brainfuckInstruction: brainfuckProgram.toCharArray() ){
            processors.get(brainfuckInstruction).process(operationalStack);
        }
        return operationalStack.pop();
    }
    interface InstructionProcessor{
        void process(Deque<List<Command>> operationalStack);
    }
}
