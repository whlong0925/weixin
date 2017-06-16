package com.mercedesme.utils;
import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public final class GsonUtils {

	private static final Gson gson = new Gson();

	private static final JsonParser jsonParser = new JsonParser();

	private GsonUtils() {
	}

	public static String toJsonString(Object object) {
		return gson.toJson(object);
	}

	public static String toJsonString(Object object, Type typeOfT) {
		return gson.toJson(object, typeOfT);
	}

	public static <T> T fromJsonString(String json,Class<T> clazz) {
		return gson.fromJson(json, clazz);
	}

	public static <T> T fromJsonString(String json, Type typeOfT) {
		return gson.fromJson(json, typeOfT);
	}

	public static JsonObject toJsonObject(String jsonStringObject)
			throws JsonSyntaxException, IllegalStateException {
		return jsonParser.parse(jsonStringObject).getAsJsonObject();
	}

	public static JsonArray toJsonArray(String jsonStringArray)
			throws JsonSyntaxException, IllegalStateException {
		return jsonParser.parse(jsonStringArray).getAsJsonArray();
	}

	public static JsonElement toJsonElement(String jsonStringElement)
			throws JsonSyntaxException, IllegalStateException {
		return jsonParser.parse(jsonStringElement);
	}

	public static JsonElement jsonElementFrom(String jsonString) {
		return jsonParser.parse(jsonString);
	}

	public static boolean isJsonObject(String jsonStringObject) {
		try {
			return toJsonObject(jsonStringObject).isJsonObject();
		} catch (IllegalStateException e) {
			return false;
		}
	}

	public static boolean isJsonArray(String jsonStringArray) {
		try {
			return toJsonArray(jsonStringArray).isJsonArray();
		} catch (IllegalStateException e) {
			return false;
		}
	}
}