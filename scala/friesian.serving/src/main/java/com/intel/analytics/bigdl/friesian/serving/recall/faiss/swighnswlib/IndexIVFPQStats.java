/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.intel.analytics.bigdl.friesian.serving.recall.faiss.swighnswlib;

public class IndexIVFPQStats {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IndexIVFPQStats(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexIVFPQStats obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IndexIVFPQStats(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setNrefine(long value) {
    swigfaissJNI.IndexIVFPQStats_nrefine_set(swigCPtr, this, value);
  }

  public long getNrefine() {
    return swigfaissJNI.IndexIVFPQStats_nrefine_get(swigCPtr, this);
  }

  public void setN_hamming_pass(long value) {
    swigfaissJNI.IndexIVFPQStats_n_hamming_pass_set(swigCPtr, this, value);
  }

  public long getN_hamming_pass() {
    return swigfaissJNI.IndexIVFPQStats_n_hamming_pass_get(swigCPtr, this);
  }

  public void setSearch_cycles(long value) {
    swigfaissJNI.IndexIVFPQStats_search_cycles_set(swigCPtr, this, value);
  }

  public long getSearch_cycles() {
    return swigfaissJNI.IndexIVFPQStats_search_cycles_get(swigCPtr, this);
  }

  public void setRefine_cycles(long value) {
    swigfaissJNI.IndexIVFPQStats_refine_cycles_set(swigCPtr, this, value);
  }

  public long getRefine_cycles() {
    return swigfaissJNI.IndexIVFPQStats_refine_cycles_get(swigCPtr, this);
  }

  public IndexIVFPQStats() {
    this(swigfaissJNI.new_IndexIVFPQStats(), true);
  }

  public void reset() {
    swigfaissJNI.IndexIVFPQStats_reset(swigCPtr, this);
  }

}
