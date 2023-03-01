public class TextEditor {
    private Command saveCommand;
    public TextEditor(){
        saveCommand = new SaveCommand();
    }
    public void onPressSaveButton(){
        System.out.println("[Save button]");
        saveCommand.execute();
    }
    public void onMenuSaveOption(){
        System.out.println("[Menu]");
        saveCommand.execute();
    }
    public void onShortcut(){
        System.out.println("[Shortcut]");
        saveCommand.execute();
    }
}