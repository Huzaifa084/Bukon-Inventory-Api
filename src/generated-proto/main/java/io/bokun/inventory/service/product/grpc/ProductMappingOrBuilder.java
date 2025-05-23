// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product_service.proto

package io.bokun.inventory.service.product.grpc;

public interface ProductMappingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.bokun.inventory.service.product.grpc.ProductMapping)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * if omitted, mapping will be created for upsert op. Otherwise updated
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * if omitted, mapping will be created for upsert op. Otherwise updated
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Mandatory.
   * </pre>
   *
   * <code>string pluginId = 2;</code>
   * @return The pluginId.
   */
  java.lang.String getPluginId();
  /**
   * <pre>
   * Mandatory.
   * </pre>
   *
   * <code>string pluginId = 2;</code>
   * @return The bytes for pluginId.
   */
  com.google.protobuf.ByteString
      getPluginIdBytes();

  /**
   * <pre>
   * Mandatory.
   * </pre>
   *
   * <code>int64 vendorId = 3;</code>
   * @return The vendorId.
   */
  long getVendorId();

  /**
   * <pre>
   * Bokun product which is mapped against inventory product. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 4;</code>
   * @return Whether the bokunProduct field is set.
   */
  boolean hasBokunProduct();
  /**
   * <pre>
   * Bokun product which is mapped against inventory product. Mandatory.
   * </pre>
   *
   * <code>.io.bokun.inventory.service.common.grpc.BokunProduct bokunProduct = 4;</code>
   * @return The bokunProduct.
   */
  io.bokun.inventory.service.common.grpc.BokunProduct getBokunProduct();

  /**
   * <pre>
   * Inventory product which is mapped against Bokun product. Mandatory.
   * </pre>
   *
   * <code>string inventoryProductId = 5;</code>
   * @return The inventoryProductId.
   */
  java.lang.String getInventoryProductId();
  /**
   * <pre>
   * Inventory product which is mapped against Bokun product. Mandatory.
   * </pre>
   *
   * <code>string inventoryProductId = 5;</code>
   * @return The bytes for inventoryProductId.
   */
  com.google.protobuf.ByteString
      getInventoryProductIdBytes();

  /**
   * <pre>
   * Mappings between external and internal pricing categories. Mandatory (should have at least one element)
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.service.common.grpc.BokunToExternalMapping pricingCategoryMappings = 6;</code>
   */
  java.util.List<io.bokun.inventory.service.common.grpc.BokunToExternalMapping> 
      getPricingCategoryMappingsList();
  /**
   * <pre>
   * Mappings between external and internal pricing categories. Mandatory (should have at least one element)
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.service.common.grpc.BokunToExternalMapping pricingCategoryMappings = 6;</code>
   */
  io.bokun.inventory.service.common.grpc.BokunToExternalMapping getPricingCategoryMappings(int index);
  /**
   * <pre>
   * Mappings between external and internal pricing categories. Mandatory (should have at least one element)
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.service.common.grpc.BokunToExternalMapping pricingCategoryMappings = 6;</code>
   */
  int getPricingCategoryMappingsCount();

  /**
   * <pre>
   * Mappings between external and internal rates. Mandatory (should have at least one element)
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.service.common.grpc.BokunToExternalMapping rateMappings = 7;</code>
   */
  java.util.List<io.bokun.inventory.service.common.grpc.BokunToExternalMapping> 
      getRateMappingsList();
  /**
   * <pre>
   * Mappings between external and internal rates. Mandatory (should have at least one element)
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.service.common.grpc.BokunToExternalMapping rateMappings = 7;</code>
   */
  io.bokun.inventory.service.common.grpc.BokunToExternalMapping getRateMappings(int index);
  /**
   * <pre>
   * Mappings between external and internal rates. Mandatory (should have at least one element)
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.service.common.grpc.BokunToExternalMapping rateMappings = 7;</code>
   */
  int getRateMappingsCount();

  /**
   * <pre>
   * Mappings between external and internal extras. Optional
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.service.common.grpc.BokunToExternalMapping extraMappings = 8;</code>
   */
  java.util.List<io.bokun.inventory.service.common.grpc.BokunToExternalMapping> 
      getExtraMappingsList();
  /**
   * <pre>
   * Mappings between external and internal extras. Optional
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.service.common.grpc.BokunToExternalMapping extraMappings = 8;</code>
   */
  io.bokun.inventory.service.common.grpc.BokunToExternalMapping getExtraMappings(int index);
  /**
   * <pre>
   * Mappings between external and internal extras. Optional
   * </pre>
   *
   * <code>repeated .io.bokun.inventory.service.common.grpc.BokunToExternalMapping extraMappings = 8;</code>
   */
  int getExtraMappingsCount();
}
