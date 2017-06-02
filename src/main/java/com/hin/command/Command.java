package com.hin.command;

/**
 * 命令接口
 *
 * @author Administrator
 */
public interface Command {
    // 执行命令
    public void execute();

    // 撤销命令
    public void undo();
}
