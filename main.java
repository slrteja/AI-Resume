import ai.clipper.OpenAICompletionClient;

public String generateResume(String prompt) {
    OpenAICompletionClient client = new OpenAICompletionClient("YOUR_API_KEY");
    String model = "text-davinci-002";
    int maxTokens = 2048;
    int n = 1;
    float temperature = 0.5f;
    String stop = null;
    List<String> prompts = Arrays.asList(prompt);
    List<String> completions = client.completions(model, maxTokens, n, temperature, stop, prompts);
    return completions.get(0);
}
