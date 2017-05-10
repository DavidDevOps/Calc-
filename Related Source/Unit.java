public class Unit
{
	public static void main(String args[])
	{
		//길이 : mm(밀리미터) ->
		final double mm_mm = 1.0;
		final double mm_cm = 0.1;
		final double mm_m = 0.001;
		final double mm_km = 1e-6;
		final double mm_in = 0.03937;
		final double mm_ft = 0.003281;
		final double mm_yd = 0.001094;
		final double mm_mile = 6.2137e-7;
		
		//길이 : cm(센치미터) ->
		final double cm_mm = 10.0;
		final double cm_cm = 1.0;
		final double cm_m = 0.01;
		final double cm_km = 0.00001;
		final double cm_in = 0.393701;
		final double cm_ft = 0.032808;
		final double cm_yd = 0.010936;
		final double cm_mile = 6.2137e-6;
		
		//길이 : m(미터) ->
		final double m_mm = 1000.0;
		final double m_cm = 100.0;
		final double m_m = 1.0;
		final double m_km = 0.001;
		final double m_in = 39.370079;
		final double m_ft = 3.28084;
		final double m_yd = 1.093613;
		final double m_mile = 0.000621;
		
		//길이 : km(킬로미터) ->
		final double km_mm = 1000000.0;
		final double km_cm = 100000.0;
		final double km_m = 1000.0;
		final double km_km = 1.0;
		final double km_in = 39370.0787;
		final double km_ft = 3280.8399;
		final double km_yd = 1093.6133;
		final double km_mile = 0.621371;
		
		//길이 : in(인치) ->
		final double in_mm = 25.4;
		final double in_cm = 2.54;
		final double in_m = 0.0254;
		final double in_km = 0.000025;
		final double in_in = 1.0;
		final double in_ft = 0.083333;
		final double in_yd = 0.027778;
		final double in_mile = 0.000016;
		
		//길이 : ft(피트) ->
		final double ft_mm = 304.8;
		final double ft_cm = 30.48;
		final double ft_m = 0.3048;
		final double ft_km = 0.000305;
		final double ft_in = 12.0;
		final double ft_ft = 1.0;
		final double ft_yd = 0.333333;
		final double ft_mile = 0.000189;
		
		//길이 : yd(야드) ->
		final double yd_mm = 914.4;
		final double yd_cm = 91.44;
		final double yd_m = 0.9144;
		final double yd_km = 0.000914;
		final double yd_in = 36.0;
		final double yd_ft = 3.0;
		final double yd_yd = 1.0;
		final double yd_mile = 0.000568;
		
		//길이 : mile(마일) ->
		final double mile_mm = 1609344.0;
		final double mile_cm = 160934.4;
		final double mile_m = 1609.344;
		final double mile_km = 1.609344;
		final double mile_in = 63360.0;
		final double mile_ft = 5280.0;
		final double mile_yd = 1760.0;
		final double mile_mile = 1.0;
		
		/////////////////////////////////////////
		
		//넓이 : m2(제곱미터) ->
		final double m2_m2 = 1.0;
		final double m2_a = 0.01;
		final double m2_ha = 0.0001;
		final double m2_km2 = 1e-6;
		final double m2_ft2 = 10.76391;
		final double m2_yd2 = 1.19599;
		final double m2_p = 0.3025;
		
		//넓이 : a(아르) ->
		final double a_m2 = 100.0;
		final double a_a = 1.0;
		final double a_ha = 0.01;
		final double a_km2 = 0.0001;
		final double a_ft2 = 1076.39104;
		final double a_yd2 = 119.599005;
		final double a_p = 30.25;
		
		//넓이 : ha(헥타르) ->
		final double ha_m2 = 10000.0;
		final double ha_a = 100.0;
		final double ha_ha = 1.0;
		final double ha_km2 = 0.01;
		final double ha_ft2 = 107639.104;
		final double ha_yd2 = 11959.9005;
		final double ha_p = 3025.0;
		
		//넓이 : km2(제곱킬로미터) ->
		final double km2_m2 = 1000000.0;
		final double km2_a = 10000.0;
		final double km2_ha = 100.0;
		final double km2_km2 = 1.0;
		final double km2_ft2 = 10763910.4;
		final double km2_yd2 = 1195990.05;
		final double km2_p = 302500.0;
		
		//넓이 : ft2(제곱피트) ->
		final double ft2_m2 = 0.092903;
		final double ft2_a = 0.000929;
		final double ft2_ha = 9.2903e-6;
		final double ft2_km2 = 9.2903e-8;
		final double ft2_ft2 = 1.0;
		final double ft2_yd2 = 0.111111;
		final double ft2_p = 0.028103;
		
		//넓이 : yd2(제곱야드) ->
		final double yd2_m2 = 0.836127;
		final double yd2_a = 0.008361;
		final double yd2_ha = 0.000084;
		final double yd2_km2 = 8.3613e-7;
		final double yd2_ft2 = 9.0;
		final double yd2_yd2 = 1.0;
		final double yd2_p = 0.252929;
		
		//넓이 : p(평) ->
		final double p_m2 = 3.305785;
		final double p_a = 0.033058;
		final double p_ha = 0.000331;
		final double p_km2 = 3.3058e-6;
		final double p_ft2 = 35.583175;
		final double p_yd2 = 3.953686;
		final double p_p = 1.0;
		
		/////////////////////////////////////////
		
		//무게 : mg(밀리그램) ->
		final double mg_mg = 1.0;
		final double mg_g = 0.001;
		final double mg_kg = 1e-6;
		final double mg_t = 10e-10;
		final double mg_kt = 1e-12;
		final double mg_gr = 0.015432;
		final double mg_oz = 0.000035;
		final double mg_lb = 2.2046e-6;
		
		//무게 : g(그램) ->
		final double g_mg = 1000.0;
		final double g_g = 1.0;
		final double g_kg = 0.001;
		final double g_t = 1e-6;
		final double g_kt = 1e-9;
		final double g_gr = 15.432358;
		final double g_oz = 0.035274;
		final double g_lb = 0.002205;
		
		//무게 : kg(킬로그램) ->
		final double kg_mg = 1000000.0;
		final double kg_g = 1000.0;
		final double kg_kg = 1.0;
		final double kg_t = 0.001;
		final double kg_kt = 1e-6;
		final double kg_gr = 15432.3584;
		final double kg_oz = 35.273962;
		final double kg_lb = 2.204623;
		
		//무게 : t(톤) ->
		final double t_mg = 1e+9;
		final double t_g = 1000000.0;
		final double t_kg = 1000.0;
		final double t_t = 1.0;
		final double t_kt = 0.001;
		final double t_gr = 15432358.4;
		final double t_oz = 35273.9619;
		final double t_lb = 2204.62262;
		
		//무게 : kt(킬로톤) ->
		final double kt_mg = 10e+11;
		final double kt_g = 1000000000.0;
		final double kt_kg = 1000000.0;
		final double kt_t = 1000.0;
		final double kt_kt = 1.0;
		final double kt_gr = 1.5432e+10;
		final double kt_oz = 35273961.9;
		final double kt_lb = 2204622.62;
		
		//무게 : gr(그레인) ->
		final double gr_mg = 64.79891;
		final double gr_g = 0.064799;
		final double gr_kg = 0.000065;
		final double gr_t = 6.4799e-8;
		final double gr_kt = 6.4799e-11;
		final double gr_gr = 1.0;
		final double gr_oz = 0.002286;
		final double gr_lb = 0.000143;
		
		//무게 : oz(온스) ->
		final double oz_mg = 28349.5231;
		final double oz_g = 28.349523;
		final double oz_kg = 0.02835;
		final double oz_t = 0.000028;
		final double oz_kt = 2.835e-8;
		final double oz_gr = 437.5;
		final double oz_oz = 1.0;
		final double oz_lb = 0.0625;
		
		//무게 : lb(파운드) ->
		final double lb_mg = 453592.37;
		final double lb_g = 453.59237;
		final double lb_kg = 0.453592;
		final double lb_t = 0.000454;
		final double lb_kt = 4.5359e-7;
		final double lb_gr = 7000.0;
		final double lb_oz = 16.0;
		final double lb_lb = 1.0;
		
		/////////////////////////////////////////
		
		//부피 : cc(씨씨) ->
		final double cc_cc = 1.0;
		final double cc_ml = 1.0;
		final double cc_l = 0.001;
		final double cc_cm3 = 1.0;
		final double cc_m3 = 1e-6;
		final double cc_in3 = 0.061024;
		final double cc_ft3 = 0.000035;
		final double cc_yd3 = 1.308e-6;
		final double cc_bbl = 6.2933e-6;
		
		//부피 : ml(밀리리터) ->
		final double ml_cc = 1.0;
		final double ml_ml = 1.0;
		final double ml_l = 0.001;
		final double ml_cm3 = 1.0;
		final double ml_m3 = 1e-6;
		final double ml_in3 = 0.061024;
		final double ml_ft3 = 0.000035;
		final double ml_yd3 = 1.308e-6;
		final double ml_bbl = 6.2933e-6;
		
		//부피 : l(리터) ->
		final double l_cc = 1000.0;
		final double l_ml = 1000.0;
		final double l_l = 1.0;
		final double l_cm3 = 1000.0;
		final double l_m3 = 0.001;
		final double l_in3 = 61.023744;
		final double l_ft3 = 0.035315;
		final double l_yd3 = 0.001308;
		final double l_bbl = 0.006293;
		
		//부피 : cm3(세제곱센치미터) ->
		final double cm3_cc = 1.0;
		final double cm3_ml = 1.0;
		final double cm3_l = 0.001;
		final double cm3_cm3 = 1.0;
		final double cm3_m3 = 1e-6;
		final double cm3_in3 = 0.061024;
		final double cm3_ft3 = 0.000035;
		final double cm3_yd3 = 1.308e-6;
		final double cm3_bbl = 6.2933e-6;
		
		//부피 : m3(세제곱미터) ->
		final double m3_cc = 1000000.0;
		final double m3_ml = 1000000.0;
		final double m3_l = 1000.0;
		final double m3_cm3 = 1000000.0;
		final double m3_m3 = 1.0;
		final double m3_in3 = 61023.7441;
		final double m3_ft3 = 35.314667;
		final double m3_yd3 = 1.307951;
		final double m3_bbl = 6.293266;
		
		//부피 : in3(세제곱인치) ->
		final double in3_cc = 16.387064;
		final double in3_ml = 16.387064;
		final double in3_l = 0.016387;
		final double in3_cm3 = 16.387064;
		final double in3_m3 = 0.000016;
		final double in3_in3 = 1.0;
		final double in3_ft3 = 0.000579;
		final double in3_yd3 = 0.000021;
		final double in3_bbl = 0.000103;
		
		//부피 : ft3(세제곱피트) ->
		final double ft3_cc = 28316.8466;
		final double ft3_ml = 28316.8466;
		final double ft3_l = 28.316847;
		final double ft3_cm3 = 28316.8466;
		final double ft3_m3 = 0.028317;
		final double ft3_in3 = 1728.0;
		final double ft3_ft3 = 1.0;
		final double ft3_yd3 = 0.037037;
		final double ft3_bbl = 0.178205;
		
		//부피 : yd3(세제곱야드) ->
		final double yd3_cc = 764554.858;
		final double yd3_ml = 764554.858;
		final double yd3_l = 764.554858;
		final double yd3_cm3 = 764554.858;
		final double yd3_m3 = 0.764555;
		final double yd3_in3 = 46656.0;
		final double yd3_ft3 = 27.0;
		final double yd3_yd3 = 1.0;
		final double yd3_bbl = 4.811547;
		
		//부피 : bbl(배럴) ->
		final double bbl_cc = 158900.0;
		final double bbl_ml = 158900.0;
		final double bbl_l = 158.9;
		final double bbl_cm3 = 158900.0;
		final double bbl_m3 = 0.1589;
		final double bbl_in3 = 9696.67294;
		final double bbl_ft3 = 5.611501;
		final double bbl_yd3 = 0.207833;
		final double bbl_bbl = 1.0;
		
		/////////////////////////////////////////
		
		//압력 : atm(기압) ->
		final double atm_atm = 1.0;
		final double atm_pa = 101325.0;
		final double atm_hpa = 1013.25;
		final double atm_kpa = 101.325;
		final double atm_mpa = 0.101325;
		
		//압력 : pa(파스칼) ->
		final double pa_atm = 9.8692e-6;
		final double pa_pa = 1.0;
		final double pa_hpa = 0.01;
		final double pa_kpa = 0.001;
		final double pa_mpa = 1e-6;
		
		//압력 : hpa(헥토파스칼) ->
		final double hpa_atm = 0.000987;
		final double hpa_pa = 100.0;
		final double hpa_hpa = 1.0;
		final double hpa_kpa = 0.1;
		final double hpa_mpa = 0.0001;
		
		//압력 : kpa(킬로파스칼) ->
		final double kpa_atm = 0.009869;
		final double kpa_pa = 1000.0;
		final double kpa_hpa = 10.0;
		final double kpa_kpa = 1.0;
		final double kpa_mpa = 0.001;
		
		//압력 : mpa(메가파스칼) ->
		final double mpa_atm = 9.869233;
		final double mpa_pa = 1000000.0;
		final double mpa_hpa = 10000.0;
		final double mpa_kpa = 1000.0;
		final double mpa_mpa = 1.0;
		
		/////////////////////////////////////////
		
		//속도 : m/s ->
		final double ms_ms = 1.0;
		final double ms_mh = 3600.0;
		final double ms_kms = 0.001;
		final double ms_kmh = 3.6;
		final double ms_ins = 39.370079;
		final double ms_inh = 141732.283;
		final double ms_fts = 3.28084;
		final double ms_fth = 11811.0236;
		final double ms_mis = 0.000621;
		final double ms_mih = 2.236936;
		final double ms_kn = 1.943844;
		final double ms_mach = 0.002941;
		
		//속도 : m/h ->
		final double mh_ms = 0.000278;
		final double mh_mh = 1.0;
		final double mh_kms = 2.7778e-7;
		final double mh_kmh = 0.001;
		final double mh_ins = 0.010936;
		final double mh_inh = 39.370079;
		final double mh_fts = 0.000911;
		final double mh_fth = 3.28084;
		final double mh_mis = 1.726e-7;
		final double mh_mih = 0.000621;
		final double mh_kn = 0.00054;
		final double mh_mach = 8.1699e-7;
		
		//속도 : km/s ->
		final double kms_ms = 1000.0;
		final double kms_mh = 3600000.0;
		final double kms_kms = 1.0;
		final double kms_kmh = 3600.0;
		final double kms_ins = 39370.0787;
		final double kms_inh = 141732283;
		final double kms_fts = 3280.8399;
		final double kms_fth = 11811023.6;
		final double kms_mis = 0.621371;
		final double kms_mih = 2236.93629;
		final double kms_kn = 1943.84449;
		final double kms_mach = 2.941176;
		
		//속도 : km/h ->
		final double kmh_ms = 0.277778;
		final double kmh_mh = 1000;
		final double kmh_kms = 0.000278;
		final double kmh_kmh = 1.0;
		final double kmh_ins = 10.936133;
		final double kmh_inh = 39370.0787;
		final double kmh_fts = 0.911344;
		final double kmh_fth = 3280.8399;
		final double kmh_mis = 0.000173;
		final double kmh_mih = 0.621371;
		final double kmh_kn = 0.539957;
		final double kmh_mach = 0.000817;
		
		//속도 : in/s ->
		final double ins_ms = 0.0254;
		final double ins_mh = 91.44;
		final double ins_kms = 0.000025;
		final double ins_kmh = 0.09144;
		final double ins_ins = 1.0;
		final double ins_inh = 3600;
		final double ins_fts = 0.083333;
		final double ins_fth = 300;
		final double ins_mis = 0.000016;
		final double ins_mih = 0.056818;
		final double ins_kn = 0.049374;
		final double ins_mach = 0.000075;
		
		//속도 : in/h ->
		final double inh_ms = 7.0556e-6;
		final double inh_mh = 0.0254;
		final double inh_kms = 7.0556e-9;
		final double inh_kmh = 0.000025;
		final double inh_ins = 0.000278;
		final double inh_inh = 1.0;
		final double inh_fts = 0.000023;
		final double inh_fth = 0.083333;
		final double inh_mis = 4.3841e-9;
		final double inh_mih = 0.000016;
		final double inh_kn = 0.000014;
		final double inh_mach = 2.0752e-8;
		
		//속도 : ft/s ->
		final double fts_ms = 0.3048;
		final double fts_mh = 1097.28;
		final double fts_kms = 0.000305;
		final double fts_kmh = 1.09728;
		final double fts_ins = 12.0;
		final double fts_inh = 43200.0;
		final double fts_fts = 1.0;
		final double fts_fth = 3600;
		final double fts_mis = 0.000189;
		final double fts_mih = 0.681818;
		final double fts_kn = 0.592484;
		final double fts_mach = 0.000896;
		
		//속도 : ft/h ->
		final double fth_ms = 0.000085;
		final double fth_mh = 0.3048;
		final double fth_kms = 8.4667e-8;
		final double fth_kmh = 0.000305;
		final double fth_ins = 0.003333;
		final double fth_inh = 12;
		final double fth_fts = 0.000278;
		final double fth_fth = 1.0;
		final double fth_mis = 5.2609e-8;
		final double fth_mih = 0.000189;
		final double fth_kn = 0.000165;
		final double fth_mach = 2.4902e-7;
		
		//속도 : mi/s ->
		final double mis_ms = 1609.344;
		final double mis_mh = 5793638.4;
		final double mis_kms = 1.609344;
		final double mis_kmh = 5793.6384;
		final double mis_ins = 63360;
		final double mis_inh = 228096000;
		final double mis_fts = 5280;
		final double mis_fth = 19008000;
		final double mis_mis = 1.0;
		final double mis_mih = 3600.0;
		final double mis_kn = 3128.31447;
		final double mis_mach = 4.733365;
		
		//속도 : mi/h ->
		final double mih_ms = 0.44704;
		final double mih_mh = 1609.344;
		final double mih_kms = 0.000447;
		final double mih_kmh = 1.609344;
		final double mih_ins = 17.6;
		final double mih_inh = 63360.0;
		final double mih_fts = 1.466667;
		final double mih_fth = 5280.0;
		final double mih_mis = 0.000278;
		final double mih_mih = 1.0;
		final double mih_kn = 0.868976;
		final double mih_mach = 0.001315;
		
		//속도 : kn(노트) ->
		final double kn_ms = 0.514444;
		final double kn_mh = 1852.0;
		final double kn_kms = 0.000514;
		final double kn_kmh = 1.852;
		final double kn_ins = 20.253718;
		final double kn_inh = 72913.3858;
		final double kn_fts = 1.68781;
		final double kn_fth = 6076.11549;
		final double kn_mis = 0.00032;
		final double kn_mih = 1.150779;
		final double kn_kn = 1.0;
		final double kn_mach = 0.001513;
		
		//속도 : mach(마하) ->
		final double mach_ms = 340.0;
		final double mach_mh = 1224000.0;
		final double mach_kms = 0.34;
		final double mach_kmh = 1224.0;
		final double mach_ins = 13385.8268;
		final double mach_inh = 48188976.4;
		final double mach_fts = 1115.48556;
		final double mach_fth = 4015748.03;
		final double mach_mis = 0.211266;
		final double mach_mih = 760.558339;
		final double mach_kn = 660.907127;
		final double mach_mach = 1.0;
		
		/////////////////////////////////////////
		
		/* tb : 테라바이트, pb : 페타바이트, eb : 엑사바이트 
		
		데이터양 : bit ->  */
		final double bit_bit = 1.0;
		final double bit_byte = 0.125;
		final double bit_kb = 0.000122;
		final double bit_mb = 1.1921e-7;
		final double bit_gb = 1.1642e-10;
		final double bit_tb = 1.1369e-13;
		final double bit_pb = 1.1102e-16;
		final double bit_eb = 1.0842e-19;
		
		//데이터양 : byte ->
		final double byte_bit = 8.0;
		final double byte_byte = 1.0;
		final double byte_kb = 0.000977;
		final double byte_mb = 9.5367e-7;
		final double byte_gb = 9.3132e-10;
		final double byte_tb = 9.0949e-13;
		final double byte_pb = 8.8818e-16;
		final double byte_eb = 8.6736e-19;
		
		//데이터양 : kb ->
		final double kb_bit = 8192.0;
		final double kb_byte = 1024.0;
		final double kb_kb = 1.0;
		final double kb_mb = 0.000977;
		final double kb_gb = 9.5367e-7;
		final double kb_tb = 9.3132e-10;
		final double kb_pb = 9.0949e-13;
		final double kb_eb = 8.8818e-16;
		
		//데이터양 : mb ->
		final double mb_bit = 8388608.0;
		final double mb_byte = 1048576.0;
		final double mb_kb = 1024.0;
		final double mb_mb = 1.0;
		final double mb_gb = 0.000977;
		final double mb_tb = 9.5367e-7;
		final double mb_pb = 9.3132e-10;
		final double mb_eb = 9.0949e-13;
		
		//데이터양 : gb ->
		final double gb_bit = 8.5899e+9;
		final double gb_byte = 1.0737e+9;
		final double gb_kb = 1048576.0;
		final double gb_mb = 1024.0;
		final double gb_gb = 1.0;
		final double gb_tb = 0.000977;
		final double gb_pb = 9.5367e-7;
		final double gb_eb = 9.3132e-10;
		
		//데이터양 : tb ->
		final double tb_bit = 8.7961e+12;
		final double tb_byte = 1.0995e+12;
		final double tb_kb = 1.0737e+9;
		final double tb_mb = 1048576.0;
		final double tb_gb = 1024.0;
		final double tb_tb = 1.0;
		final double tb_pb = 0.000977;
		final double tb_eb = 9.5367e-7;
		
		//데이터양 : pb ->
		final double pb_bit = 9.0072e+15;
		final double pb_byte = 1.1259e+15;
		final double pb_kb = 1.0995e+12;
		final double pb_mb = 1.0737e+9;
		final double pb_gb = 1048576;
		final double pb_tb = 1024.0;
		final double pb_pb = 1.0;
		final double pb_eb = 0.000977;
		
		//데이터양 : eb ->
		final double eb_bit = 9.2234e+18;
		final double eb_byte = 1.1529e+18;
		final double eb_kb = 1.1259e+15;
		final double eb_mb = 1.0995e+12;
		final double eb_gb = 1.0737e+9;
		final double eb_tb = 1048576;
		final double eb_pb = 1024.0;
		final double eb_eb = 1.0;
	}
}