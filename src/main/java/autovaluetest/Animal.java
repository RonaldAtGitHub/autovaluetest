package autovaluetest;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
abstract class Animal {
	abstract String name();

	abstract int numberOfLegs();

	static Builder builder() {
		return new AutoValue_Animal.Builder();
	}

	/**
	 * This will trigger the annotation processor to add GsonTypeAdapter.
	 * For more info see com.ryanharter.auto.value.gson.AutoValueGsonExtension
	 */
	public static TypeAdapter<Animal> typeAdapter(Gson gson) {
		return new AutoValue_Animal.GsonTypeAdapter(gson);
	}

	@AutoValue.Builder
	abstract static class Builder {
		abstract Builder setName(String value);

		abstract Builder setNumberOfLegs(int value);

		abstract Animal build();
	}
}