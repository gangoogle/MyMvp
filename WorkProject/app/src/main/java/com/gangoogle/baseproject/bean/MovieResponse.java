package com.gangoogle.baseproject.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zgyi on 2018/9/25.
 */
public class MovieResponse extends BaseResultBean {

    private String status;
    private DataBean data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private String province;
        private String code;
        private String tel;
        private String cityadcode;
        private String areacode;
        private String timestamp;
        private SeaAreaBean sea_area;
        private String pos;
        private String hn;
        @SerializedName("result")
        private String resultX;
        private String message;
        private String desc;
        private String city;
        private String districtadcode;
        private String district;
        private String countrycode;
        private String country;
        private String provinceadcode;
        private String version;
        private String adcode;
        private List<CrossListBean> cross_list;
        private List<RoadListBean> road_list;
        private List<PoiListBean> poi_list;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getCityadcode() {
            return cityadcode;
        }

        public void setCityadcode(String cityadcode) {
            this.cityadcode = cityadcode;
        }

        public String getAreacode() {
            return areacode;
        }

        public void setAreacode(String areacode) {
            this.areacode = areacode;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public SeaAreaBean getSea_area() {
            return sea_area;
        }

        public void setSea_area(SeaAreaBean sea_area) {
            this.sea_area = sea_area;
        }

        public String getPos() {
            return pos;
        }

        public void setPos(String pos) {
            this.pos = pos;
        }

        public String getHn() {
            return hn;
        }

        public void setHn(String hn) {
            this.hn = hn;
        }

        public String getResultX() {
            return resultX;
        }

        public void setResultX(String resultX) {
            this.resultX = resultX;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDistrictadcode() {
            return districtadcode;
        }

        public void setDistrictadcode(String districtadcode) {
            this.districtadcode = districtadcode;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getCountrycode() {
            return countrycode;
        }

        public void setCountrycode(String countrycode) {
            this.countrycode = countrycode;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getProvinceadcode() {
            return provinceadcode;
        }

        public void setProvinceadcode(String provinceadcode) {
            this.provinceadcode = provinceadcode;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getAdcode() {
            return adcode;
        }

        public void setAdcode(String adcode) {
            this.adcode = adcode;
        }

        public List<CrossListBean> getCross_list() {
            return cross_list;
        }

        public void setCross_list(List<CrossListBean> cross_list) {
            this.cross_list = cross_list;
        }

        public List<RoadListBean> getRoad_list() {
            return road_list;
        }

        public void setRoad_list(List<RoadListBean> road_list) {
            this.road_list = road_list;
        }

        public List<PoiListBean> getPoi_list() {
            return poi_list;
        }

        public void setPoi_list(List<PoiListBean> poi_list) {
            this.poi_list = poi_list;
        }

        public static class SeaAreaBean {
            /**
             * adcode :
             * name :
             */

            private String adcode;
            private String name;

            public String getAdcode() {
                return adcode;
            }

            public void setAdcode(String adcode) {
                this.adcode = adcode;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class CrossListBean {
            /**
             * distance : 149.103
             * direction : West
             * name : 联谊路--绿溪路
             * weight : 120
             * level : 45000, 45000
             * longitude : 121.0508253
             * crossid : 021H51F0090093035--021H51F009009851
             * width : 8, 8
             * latitude : 31.31557944
             */

            private String distance;
            private String direction;
            private String name;
            private String weight;
            private String level;
            private String longitude;
            private String crossid;
            private String width;
            private String latitude;

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public String getDirection() {
                return direction;
            }

            public void setDirection(String direction) {
                this.direction = direction;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public String getCrossid() {
                return crossid;
            }

            public void setCrossid(String crossid) {
                this.crossid = crossid;
            }

            public String getWidth() {
                return width;
            }

            public void setWidth(String width) {
                this.width = width;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }
        }

        public static class RoadListBean {
            /**
             * distance : 77
             * direction : NorthWest
             * name : 绿溪路
             * level : 5
             * longitude : 121.05
             * width : 8
             * roadid : 021H51F009009851
             * latitude : 31.3151
             */

            private String distance;
            private String direction;
            private String name;
            private String level;
            private String longitude;
            private String width;
            private String roadid;
            private String latitude;

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public String getDirection() {
                return direction;
            }

            public void setDirection(String direction) {
                this.direction = direction;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getLevel() {
                return level;
            }

            public void setLevel(String level) {
                this.level = level;
            }

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public String getWidth() {
                return width;
            }

            public void setWidth(String width) {
                this.width = width;
            }

            public String getRoadid() {
                return roadid;
            }

            public void setRoadid(String roadid) {
                this.roadid = roadid;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }
        }

        public static class PoiListBean {

            private String parent;
            private String distance;
            private String direction;
            private String tel;
            private String name;
            private String weight;
            private String typecode;
            private String childtype;
            private String longitude;
            private String towards_angle;
            private String f_nona;
            private String address;
            private String latitude;
            private String end_poi_extension;
            private String type;
            private String poiid;
            private List<EntrancesBean> entrances;

            public String getParent() {
                return parent;
            }

            public void setParent(String parent) {
                this.parent = parent;
            }

            public String getDistance() {
                return distance;
            }

            public void setDistance(String distance) {
                this.distance = distance;
            }

            public String getDirection() {
                return direction;
            }

            public void setDirection(String direction) {
                this.direction = direction;
            }

            public String getTel() {
                return tel;
            }

            public void setTel(String tel) {
                this.tel = tel;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getWeight() {
                return weight;
            }

            public void setWeight(String weight) {
                this.weight = weight;
            }

            public String getTypecode() {
                return typecode;
            }

            public void setTypecode(String typecode) {
                this.typecode = typecode;
            }

            public String getChildtype() {
                return childtype;
            }

            public void setChildtype(String childtype) {
                this.childtype = childtype;
            }

            public String getLongitude() {
                return longitude;
            }

            public void setLongitude(String longitude) {
                this.longitude = longitude;
            }

            public String getTowards_angle() {
                return towards_angle;
            }

            public void setTowards_angle(String towards_angle) {
                this.towards_angle = towards_angle;
            }

            public String getF_nona() {
                return f_nona;
            }

            public void setF_nona(String f_nona) {
                this.f_nona = f_nona;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getLatitude() {
                return latitude;
            }

            public void setLatitude(String latitude) {
                this.latitude = latitude;
            }

            public String getEnd_poi_extension() {
                return end_poi_extension;
            }

            public void setEnd_poi_extension(String end_poi_extension) {
                this.end_poi_extension = end_poi_extension;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getPoiid() {
                return poiid;
            }

            public void setPoiid(String poiid) {
                this.poiid = poiid;
            }

            public List<EntrancesBean> getEntrances() {
                return entrances;
            }

            public void setEntrances(List<EntrancesBean> entrances) {
                this.entrances = entrances;
            }

            public static class EntrancesBean {
                /**
                 * latitude : 31.314923
                 * longitude : 121.047078
                 */

                private String latitude;
                private String longitude;

                public String getLatitude() {
                    return latitude;
                }

                public void setLatitude(String latitude) {
                    this.latitude = latitude;
                }

                public String getLongitude() {
                    return longitude;
                }

                public void setLongitude(String longitude) {
                    this.longitude = longitude;
                }
            }
        }
    }
}
