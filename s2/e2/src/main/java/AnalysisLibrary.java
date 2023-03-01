public class AnalysisLibrary {
    public void analyzeInformation(String json) throws Exception{
        if(!validateJson(json)){
            throw new Exception("La información no tiene formato JSON");
        }
        System.out.println("Procesando la información...");
    }
    public boolean validateJson(String json){
        return true;
    }
}