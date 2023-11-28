package com.store.model

class UnrecognizedTypeException(type: String) : Throwable("Unrecognized type: $type")
