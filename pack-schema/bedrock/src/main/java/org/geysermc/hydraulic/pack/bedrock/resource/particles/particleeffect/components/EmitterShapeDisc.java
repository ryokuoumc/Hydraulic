package org.geysermc.hydraulic.pack.bedrock.resource.particles.particleeffect.components;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.String;

/**
 * Emitter Shape Disc Component For 1.10.0
 */
public class EmitterShapeDisc {
  public String direction;

  public String radius;

  @JsonProperty("plane_normal")
  public String planeNormal;

  @JsonProperty("surface_only")
  public boolean surfaceOnly;

  public String getDirection() {
    return this.direction;
  }

  public void setDirection(String direction) {
    this.direction = direction;
  }

  public String getRadius() {
    return this.radius;
  }

  public void setRadius(String radius) {
    this.radius = radius;
  }

  public String getPlaneNormal() {
    return this.planeNormal;
  }

  public void setPlaneNormal(String planeNormal) {
    this.planeNormal = planeNormal;
  }

  /**
   * @return Surface Only
   */
  public boolean getSurfaceOnly() {
    return this.surfaceOnly;
  }

  /**
   * @param surfaceOnly Surface Only
   */
  public void setSurfaceOnly(boolean surfaceOnly) {
    this.surfaceOnly = surfaceOnly;
  }
}