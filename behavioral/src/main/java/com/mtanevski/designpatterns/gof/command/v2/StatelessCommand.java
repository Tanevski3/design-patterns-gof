package com.mtanevski.designpatterns.gof.command.v2;

/**
 * Can't have undo operation
 */
public interface StatelessCommand {
    void execute(Context context);
}
