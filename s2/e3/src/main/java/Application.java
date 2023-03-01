public class Application {
    public static void main(String[] args){
        TextEditor editor = new TextEditor();
        // Desde botón guardar
        editor.onPressSaveButton();
        // Desde menú
        editor.onMenuSaveOption();
        // Desde combinación del teclado
        editor.onShortcut();
    }
}