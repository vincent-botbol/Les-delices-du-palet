package com.delices.datastore;

public interface DataUpdater<T> {

	T fetchContent();
	
	void storeContent(T content);
}
