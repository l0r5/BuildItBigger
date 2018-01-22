package com.udacity.gradle.builditbigger;


import android.test.AndroidTestCase;
import android.util.Log;

public class EndpointsTest extends AndroidTestCase {

    private static final String LOG_TAG = "NonEmptyStringTest";

    @SuppressWarnings("unchecked")
    public void test() {
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext(), null);
        endpointsAsyncTask.execute();
        try {
            result = endpointsAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}

