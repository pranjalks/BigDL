/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.intel.analytics.bigdl.friesian.serving.recall.faiss.swighnswlib;

public class IndexHNSW extends Index {
  private transient long swigCPtr;

  protected IndexHNSW(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.IndexHNSW_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IndexHNSW obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_IndexHNSW(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setHnsw(HNSW value) {
    swigfaissJNI.IndexHNSW_hnsw_set(swigCPtr, this, HNSW.getCPtr(value), value);
  }

  public HNSW getHnsw() {
    long cPtr = swigfaissJNI.IndexHNSW_hnsw_get(swigCPtr, this);
    return (cPtr == 0) ? null : new HNSW(cPtr, false);
  }

  public void setOwn_fields(boolean value) {
    swigfaissJNI.IndexHNSW_own_fields_set(swigCPtr, this, value);
  }

  public boolean getOwn_fields() {
    return swigfaissJNI.IndexHNSW_own_fields_get(swigCPtr, this);
  }

  public void setStorage(Index value) {
    swigfaissJNI.IndexHNSW_storage_set(swigCPtr, this, Index.getCPtr(value), value);
  }

  public Index getStorage() {
    long cPtr = swigfaissJNI.IndexHNSW_storage_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Index(cPtr, false);
  }

  public void setReconstruct_from_neighbors(ReconstructFromNeighbors value) {
    swigfaissJNI.IndexHNSW_reconstruct_from_neighbors_set(swigCPtr, this, ReconstructFromNeighbors.getCPtr(value), value);
  }

  public ReconstructFromNeighbors getReconstruct_from_neighbors() {
    long cPtr = swigfaissJNI.IndexHNSW_reconstruct_from_neighbors_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ReconstructFromNeighbors(cPtr, false);
  }

  public IndexHNSW(int d, int M, MetricType metric) {
    this(swigfaissJNI.new_IndexHNSW__SWIG_0(d, M, metric.swigValue()), true);
  }

  public IndexHNSW(int d, int M) {
    this(swigfaissJNI.new_IndexHNSW__SWIG_1(d, M), true);
  }

  public IndexHNSW(int d) {
    this(swigfaissJNI.new_IndexHNSW__SWIG_2(d), true);
  }

  public IndexHNSW() {
    this(swigfaissJNI.new_IndexHNSW__SWIG_3(), true);
  }

  public IndexHNSW(Index storage, int M) {
    this(swigfaissJNI.new_IndexHNSW__SWIG_4(Index.getCPtr(storage), storage, M), true);
  }

  public IndexHNSW(Index storage) {
    this(swigfaissJNI.new_IndexHNSW__SWIG_5(Index.getCPtr(storage), storage), true);
  }

  public void add(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexHNSW_add(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void train(int n, SWIGTYPE_p_float x) {
    swigfaissJNI.IndexHNSW_train(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x));
  }

  public void search(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels) {
    swigfaissJNI.IndexHNSW_search(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels));
  }

  public void reconstruct(int key, SWIGTYPE_p_float recons) {
    swigfaissJNI.IndexHNSW_reconstruct(swigCPtr, this, key, SWIGTYPE_p_float.getCPtr(recons));
  }

  public void reset() {
    swigfaissJNI.IndexHNSW_reset(swigCPtr, this);
  }

  public void shrink_level_0_neighbors(int size) {
    swigfaissJNI.IndexHNSW_shrink_level_0_neighbors(swigCPtr, this, size);
  }

  public void search_level_0(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_int nearest, SWIGTYPE_p_float nearest_d, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels, int nprobe, int search_type) {
    swigfaissJNI.IndexHNSW_search_level_0__SWIG_0(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_int.getCPtr(nearest), SWIGTYPE_p_float.getCPtr(nearest_d), SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels), nprobe, search_type);
  }

  public void search_level_0(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_int nearest, SWIGTYPE_p_float nearest_d, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels, int nprobe) {
    swigfaissJNI.IndexHNSW_search_level_0__SWIG_1(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_int.getCPtr(nearest), SWIGTYPE_p_float.getCPtr(nearest_d), SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels), nprobe);
  }

  public void search_level_0(int n, SWIGTYPE_p_float x, int k, SWIGTYPE_p_int nearest, SWIGTYPE_p_float nearest_d, SWIGTYPE_p_float distances, SWIGTYPE_p_long labels) {
    swigfaissJNI.IndexHNSW_search_level_0__SWIG_2(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), k, SWIGTYPE_p_int.getCPtr(nearest), SWIGTYPE_p_float.getCPtr(nearest_d), SWIGTYPE_p_float.getCPtr(distances), SWIGTYPE_p_long.getCPtr(labels));
  }

  public void init_level_0_from_knngraph(int k, SWIGTYPE_p_float D, SWIGTYPE_p_long I) {
    swigfaissJNI.IndexHNSW_init_level_0_from_knngraph(swigCPtr, this, k, SWIGTYPE_p_float.getCPtr(D), SWIGTYPE_p_long.getCPtr(I));
  }

  public void init_level_0_from_entry_points(int npt, SWIGTYPE_p_int points, SWIGTYPE_p_int nearests) {
    swigfaissJNI.IndexHNSW_init_level_0_from_entry_points(swigCPtr, this, npt, SWIGTYPE_p_int.getCPtr(points), SWIGTYPE_p_int.getCPtr(nearests));
  }

  public void reorder_links() {
    swigfaissJNI.IndexHNSW_reorder_links(swigCPtr, this);
  }

  public void link_singletons() {
    swigfaissJNI.IndexHNSW_link_singletons(swigCPtr, this);
  }

}
