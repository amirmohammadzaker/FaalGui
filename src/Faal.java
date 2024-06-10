import com.fasterxml.jackson.annotation.JsonProperty;

public class Faal {
    @JsonProperty("Poem")
    private String poem;

    @JsonProperty("Interpretation")
    private String interpretation;

    public String getInterpretation() {
        return this.interpretation;
    }

    public String getPoem() {
        return this.poem;
    }

}
