package org.itxtech.nemisys.command;

import org.itxtech.nemisys.event.TextContainer;

/**
 * Represents an RCON command sender.
 *
 * @author Tee7even
 */
public class RemoteConsoleCommandSender extends ConsoleCommandSender {

    private StringBuilder messages = new StringBuilder();

    @Override
    public void sendMessage(String message) {
        message = this.getServer().getLanguage().translateString(message);
        this.messages.append(message.trim()).append("\n");
        if (messages.length() > 50000) {
            messages.delete(0, 49000);
        }
    }

    @Override
    public void sendMessage(TextContainer message) {
        this.sendMessage(this.getServer().getLanguage().translate(message));
    }

    public String getMessages() {
        return messages.toString();
    }

    @Override
    public String getName() {
        return "Rcon";
    }
}
