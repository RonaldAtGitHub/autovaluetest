package autovaluetest;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import javax.annotation.Generated;

@Generated(
    value = "com.ryanharter.auto.value.gson.AutoValueGsonExtension",
    comments = "https://github.com/rharter/auto-value-gson"
)
final class AutoValue_Animal extends $AutoValue_Animal {
  AutoValue_Animal(String name, int numberOfLegs) {
    super(name, numberOfLegs);
  }

  static final class GsonTypeAdapter extends TypeAdapter<Animal> {
    private volatile TypeAdapter<String> string_adapter;
    private volatile TypeAdapter<Integer> int__adapter;
    private final Gson gson;
    GsonTypeAdapter(Gson gson) {
      this.gson = gson;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void write(JsonWriter jsonWriter, Animal object) throws IOException {
      if (object == null) {
        jsonWriter.nullValue();
        return;
      }
      jsonWriter.beginObject();
      jsonWriter.name("name");
      if (object.name() == null) {
        jsonWriter.nullValue();
      } else {
        TypeAdapter<String> string_adapter = this.string_adapter;
        if (string_adapter == null) {
          this.string_adapter = string_adapter = gson.getAdapter(String.class);
        }
        string_adapter.write(jsonWriter, object.name());
      }
      jsonWriter.name("numberOfLegs");
      {
        TypeAdapter<Integer> int__adapter = this.int__adapter;
        if (int__adapter == null) {
          this.int__adapter = int__adapter = gson.getAdapter(Integer.class);
        }
        int__adapter.write(jsonWriter, object.numberOfLegs());
      }
      jsonWriter.endObject();
    }
    @Override
    @SuppressWarnings("unchecked")
    public Animal read(JsonReader jsonReader) throws IOException {
      if (jsonReader.peek() == JsonToken.NULL) {
        jsonReader.nextNull();
        return null;
      }
      jsonReader.beginObject();
      Animal.Builder builder = Animal.builder();
      while (jsonReader.hasNext()) {
        String _name = jsonReader.nextName();
        if (jsonReader.peek() == JsonToken.NULL) {
          jsonReader.nextNull();
          continue;
        }
        switch (_name) {
          default: {
            if ("name".equals(_name)) {
              TypeAdapter<String> string_adapter = this.string_adapter;
              if (string_adapter == null) {
                this.string_adapter = string_adapter = gson.getAdapter(String.class);
              }
              builder.setName(string_adapter.read(jsonReader));
              continue;
            }
            if ("numberOfLegs".equals(_name)) {
              TypeAdapter<Integer> int__adapter = this.int__adapter;
              if (int__adapter == null) {
                this.int__adapter = int__adapter = gson.getAdapter(Integer.class);
              }
              builder.setNumberOfLegs(int__adapter.read(jsonReader));
              continue;
            }
            jsonReader.skipValue();
          }
        }
      }
      jsonReader.endObject();
      return builder.abstract autovaluetest.Animal build();
    }
    @Override
    public String toString() {
      return new StringBuilder().append("TypeAdapter(").append("Animal").append(")").toString();
    }
  }
}
