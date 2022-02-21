package ua.nure.second.allCommand;

import ua.nure.second.strategy.EndLoopSymbol;
import ua.nure.second.strategy.StandardSymbol;
import ua.nure.second.strategy.StartLoopSymbol;
import ua.nure.second.strategy.SymbolStrategy;

import java.util.HashMap;
import java.util.Map;

public class Symbols {

    private final Map<String, SymbolStrategy> symbolStrategies;
    private final CommandList commandList;

    public Symbols(CommandList commandList) {
        this.commandList = commandList;
        symbolStrategies = new HashMap<>();
        addSymbolStrategies();
    }



    public SymbolStrategy getSymbolStrategy(String symbol) {
        return symbolStrategies.getOrDefault(symbol, new StandardSymbol(symbol, commandList));
    }

    private void addSymbolStrategies() {
        symbolStrategies.put("[", new StartLoopSymbol());
        symbolStrategies.put("]", new EndLoopSymbol());
    }


}