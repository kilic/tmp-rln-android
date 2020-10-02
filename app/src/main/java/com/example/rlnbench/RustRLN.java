package com.example.rlnbench;

public class RustRLN {

    private static native String runBench();

    public String _runBench() {
        return runBench();
    }
}
