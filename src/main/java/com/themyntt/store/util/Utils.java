package com.themyntt.store.util;

import java.util.UUID;

public class Utils {
    public String createId() {
        String id = UUID.randomUUID().toString();
        return id.replaceAll("-", "").substring(0, 15);
    }
}
