package com.calculator.calc;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.actionbarsherlock.app.SherlockFragment;

import java.text.DecimalFormat;

public class Unit extends SherlockFragment {

	View v;

	//////////////////////////////////////////////////////////////////////////////// 길이
	//mm(밀리미터) ->
	final double mm_mm = 1.0;
	final double mm_cm = 0.1;
	final double mm_m = 0.001;
	final double mm_km = 1e-6;
	final double mm_in = 0.03937;
	final double mm_ft = 0.003281;
	final double mm_yd = 0.001094;
	final double mm_mile = 6.2137e-7;

	//cm(센치미터) ->
	final double cm_mm = 10.0;
	final double cm_cm = 1.0;
	final double cm_m = 0.01;
	final double cm_km = 0.00001;
	final double cm_in = 0.393701;
	final double cm_ft = 0.032808;
	final double cm_yd = 0.010936;
	final double cm_mile = 6.2137e-6;

	//m(미터) ->
	final double m_mm = 1000.0;
	final double m_cm = 100.0;
	final double m_m = 1.0;
	final double m_km = 0.001;
	final double m_in = 39.370079;
	final double m_ft = 3.28084;
	final double m_yd = 1.093613;
	final double m_mile = 0.000621;

	//km(킬로미터) ->
	final double km_mm = 1000000.0;
	final double km_cm = 100000.0;
	final double km_m = 1000.0;
	final double km_km = 1.0;
	final double km_in = 39370.0787;
	final double km_ft = 3280.8399;
	final double km_yd = 1093.6133;
	final double km_mile = 0.621371;

	//in(인치) ->
	final double in_mm = 25.4;
	final double in_cm = 2.54;
	final double in_m = 0.0254;
	final double in_km = 0.000025;
	final double in_in = 1.0;
	final double in_ft = 0.083333;
	final double in_yd = 0.027778;
	final double in_mile = 0.000016;

	//ft(피트) ->
	final double ft_mm = 304.8;
	final double ft_cm = 30.48;
	final double ft_m = 0.3048;
	final double ft_km = 0.000305;
	final double ft_in = 12.0;
	final double ft_ft = 1.0;
	final double ft_yd = 0.333333;
	final double ft_mile = 0.000189;

	//yd(야드) ->
	final double yd_mm = 914.4;
	final double yd_cm = 91.44;
	final double yd_m = 0.9144;
	final double yd_km = 0.000914;
	final double yd_in = 36.0;
	final double yd_ft = 3.0;
	final double yd_yd = 1.0;
	final double yd_mile = 0.000568;

	//mile(마일) ->
	final double mile_mm = 1609344.0;
	final double mile_cm = 160934.4;
	final double mile_m = 1609.344;
	final double mile_km = 1.609344;
	final double mile_in = 63360.0;
	final double mile_ft = 5280.0;
	final double mile_yd = 1760.0;
	final double mile_mile = 1.0;
	//////////////////////////////////////////////////////////////////////////////// 길이 : 64개

	//////////////////////////////////////////////////////////////////////////////// 넓이
	//m2(제곱미터) ->
	final double m2_m2 = 1.0;
	final double m2_a = 0.01;
	final double m2_ha = 0.0001;
	final double m2_km2 = 1e-6;
	final double m2_ft2 = 10.76391;
	final double m2_yd2 = 1.19599;
	final double m2_p = 0.3025;

	//a(아르) ->
	final double a_m2 = 100.0;
	final double a_a = 1.0;
	final double a_ha = 0.01;
	final double a_km2 = 0.0001;
	final double a_ft2 = 1076.39104;
	final double a_yd2 = 119.599005;
	final double a_p = 30.25;

	//ha(헥타르) ->
	final double ha_m2 = 10000.0;
	final double ha_a = 100.0;
	final double ha_ha = 1.0;
	final double ha_km2 = 0.01;
	final double ha_ft2 = 107639.104;
	final double ha_yd2 = 11959.9005;
	final double ha_p = 3025.0;

	//km2(제곱킬로미터) ->
	final double km2_m2 = 1000000.0;
	final double km2_a = 10000.0;
	final double km2_ha = 100.0;
	final double km2_km2 = 1.0;
	final double km2_ft2 = 10763910.4;
	final double km2_yd2 = 1195990.05;
	final double km2_p = 302500.0;

	//ft2(제곱피트) ->
	final double ft2_m2 = 0.092903;
	final double ft2_a = 0.000929;
	final double ft2_ha = 9.2903e-6;
	final double ft2_km2 = 9.2903e-8;
	final double ft2_ft2 = 1.0;
	final double ft2_yd2 = 0.111111;
	final double ft2_p = 0.028103;

	//yd2(제곱야드) ->
	final double yd2_m2 = 0.836127;
	final double yd2_a = 0.008361;
	final double yd2_ha = 0.000084;
	final double yd2_km2 = 8.3613e-7;
	final double yd2_ft2 = 9.0;
	final double yd2_yd2 = 1.0;
	final double yd2_p = 0.252929;

	//p(평) ->
	final double p_m2 = 3.305785;
	final double p_a = 0.033058;
	final double p_ha = 0.000331;
	final double p_km2 = 3.3058e-6;
	final double p_ft2 = 35.583175;
	final double p_yd2 = 3.953686;
	final double p_p = 1.0;
	//////////////////////////////////////////////////////////////////////////////// 넓이 : 49개

	//////////////////////////////////////////////////////////////////////////////// 무게
	//mg(밀리그램) ->
	final double mg_mg = 1.0;
	final double mg_g = 0.001;
	final double mg_kg = 1e-6;
	final double mg_t = 10e-10;
	final double mg_kt = 1e-12;
	final double mg_gr = 0.015432;
	final double mg_oz = 0.000035;
	final double mg_lb = 2.2046e-6;

	//g(그램) ->
	final double g_mg = 1000.0;
	final double g_g = 1.0;
	final double g_kg = 0.001;
	final double g_t = 1e-6;
	final double g_kt = 1e-9;
	final double g_gr = 15.432358;
	final double g_oz = 0.035274;
	final double g_lb = 0.002205;

	//kg(킬로그램) ->
	final double kg_mg = 1000000.0;
	final double kg_g = 1000.0;
	final double kg_kg = 1.0;
	final double kg_t = 0.001;
	final double kg_kt = 1e-6;
	final double kg_gr = 15432.3584;
	final double kg_oz = 35.273962;
	final double kg_lb = 2.204623;

	//t(톤) ->
	final double t_mg = 1e+9;
	final double t_g = 1000000.0;
	final double t_kg = 1000.0;
	final double t_t = 1.0;
	final double t_kt = 0.001;
	final double t_gr = 15432358.4;
	final double t_oz = 35273.9619;
	final double t_lb = 2204.62262;

	//kt(킬로톤) ->
	final double kt_mg = 10e+11;
	final double kt_g = 1000000000.0;
	final double kt_kg = 1000000.0;
	final double kt_t = 1000.0;
	final double kt_kt = 1.0;
	final double kt_gr = 1.5432e+10;
	final double kt_oz = 35273961.9;
	final double kt_lb = 2204622.62;

	//gr(그레인) ->
	final double gr_mg = 64.79891;
	final double gr_g = 0.064799;
	final double gr_kg = 0.000065;
	final double gr_t = 6.4799e-8;
	final double gr_kt = 6.4799e-11;
	final double gr_gr = 1.0;
	final double gr_oz = 0.002286;
	final double gr_lb = 0.000143;

	//oz(온스) ->
	final double oz_mg = 28349.5231;
	final double oz_g = 28.349523;
	final double oz_kg = 0.02835;
	final double oz_t = 0.000028;
	final double oz_kt = 2.835e-8;
	final double oz_gr = 437.5;
	final double oz_oz = 1.0;
	final double oz_lb = 0.0625;

	//lb(파운드) ->
	final double lb_mg = 453592.37;
	final double lb_g = 453.59237;
	final double lb_kg = 0.453592;
	final double lb_t = 0.000454;
	final double lb_kt = 4.5359e-7;
	final double lb_gr = 7000.0;
	final double lb_oz = 16.0;
	final double lb_lb = 1.0;
	//////////////////////////////////////////////////////////////////////////////// 무게 : 64개

	//////////////////////////////////////////////////////////////////////////////// 부피
	//cc(씨씨) ->
	final double cc_cc = 1.0;
	final double cc_ml = 1.0;
	final double cc_l = 0.001;
	final double cc_cm3 = 1.0;
	final double cc_m3 = 1e-6;
	final double cc_in3 = 0.061024;
	final double cc_ft3 = 0.000035;
	final double cc_yd3 = 1.308e-6;
	final double cc_bbl = 6.2933e-6;

	//ml(밀리리터) ->
	final double ml_cc = 1.0;
	final double ml_ml = 1.0;
	final double ml_l = 0.001;
	final double ml_cm3 = 1.0;
	final double ml_m3 = 1e-6;
	final double ml_in3 = 0.061024;
	final double ml_ft3 = 0.000035;
	final double ml_yd3 = 1.308e-6;
	final double ml_bbl = 6.2933e-6;

	//l(리터) ->
	final double l_cc = 1000.0;
	final double l_ml = 1000.0;
	final double l_l = 1.0;
	final double l_cm3 = 1000.0;
	final double l_m3 = 0.001;
	final double l_in3 = 61.023744;
	final double l_ft3 = 0.035315;
	final double l_yd3 = 0.001308;
	final double l_bbl = 0.006293;

	//cm3(세제곱센치미터) ->
	final double cm3_cc = 1.0;
	final double cm3_ml = 1.0;
	final double cm3_l = 0.001;
	final double cm3_cm3 = 1.0;
	final double cm3_m3 = 1e-6;
	final double cm3_in3 = 0.061024;
	final double cm3_ft3 = 0.000035;
	final double cm3_yd3 = 1.308e-6;
	final double cm3_bbl = 6.2933e-6;

	//m3(세제곱미터) ->
	final double m3_cc = 1000000.0;
	final double m3_ml = 1000000.0;
	final double m3_l = 1000.0;
	final double m3_cm3 = 1000000.0;
	final double m3_m3 = 1.0;
	final double m3_in3 = 61023.7441;
	final double m3_ft3 = 35.314667;
	final double m3_yd3 = 1.307951;
	final double m3_bbl = 6.293266;

	//in3(세제곱인치) ->
	final double in3_cc = 16.387064;
	final double in3_ml = 16.387064;
	final double in3_l = 0.016387;
	final double in3_cm3 = 16.387064;
	final double in3_m3 = 0.000016;
	final double in3_in3 = 1.0;
	final double in3_ft3 = 0.000579;
	final double in3_yd3 = 0.000021;
	final double in3_bbl = 0.000103;

	//ft3(세제곱피트) ->
	final double ft3_cc = 28316.8466;
	final double ft3_ml = 28316.8466;
	final double ft3_l = 28.316847;
	final double ft3_cm3 = 28316.8466;
	final double ft3_m3 = 0.028317;
	final double ft3_in3 = 1728.0;
	final double ft3_ft3 = 1.0;
	final double ft3_yd3 = 0.037037;
	final double ft3_bbl = 0.178205;

	//yd3(세제곱야드) ->
	final double yd3_cc = 764554.858;
	final double yd3_ml = 764554.858;
	final double yd3_l = 764.554858;
	final double yd3_cm3 = 764554.858;
	final double yd3_m3 = 0.764555;
	final double yd3_in3 = 46656.0;
	final double yd3_ft3 = 27.0;
	final double yd3_yd3 = 1.0;
	final double yd3_bbl = 4.811547;

	//bbl(배럴) ->
	final double bbl_cc = 158900.0;
	final double bbl_ml = 158900.0;
	final double bbl_l = 158.9;
	final double bbl_cm3 = 158900.0;
	final double bbl_m3 = 0.1589;
	final double bbl_in3 = 9696.67294;
	final double bbl_ft3 = 5.611501;
	final double bbl_yd3 = 0.207833;
	final double bbl_bbl = 1.0;
	//////////////////////////////////////////////////////////////////////////////// 부피 : 81개

	//////////////////////////////////////////////////////////////////////////////// 압력
	//atm(기압) ->
	final double atm_atm = 1.0;
	final double atm_pa = 101325.0;
	final double atm_hpa = 1013.25;
	final double atm_kpa = 101.325;
	final double atm_mpa = 0.101325;

	//pa(파스칼) ->
	final double pa_atm = 9.8692e-6;
	final double pa_pa = 1.0;
	final double pa_hpa = 0.01;
	final double pa_kpa = 0.001;
	final double pa_mpa = 1e-6;

	//hpa(헥토파스칼) ->
	final double hpa_atm = 0.000987;
	final double hpa_pa = 100.0;
	final double hpa_hpa = 1.0;
	final double hpa_kpa = 0.1;
	final double hpa_mpa = 0.0001;

	//kpa(킬로파스칼) ->
	final double kpa_atm = 0.009869;
	final double kpa_pa = 1000.0;
	final double kpa_hpa = 10.0;
	final double kpa_kpa = 1.0;
	final double kpa_mpa = 0.001;

	//mpa(메가파스칼) ->
	final double mpa_atm = 9.869233;
	final double mpa_pa = 1000000.0;
	final double mpa_hpa = 10000.0;
	final double mpa_kpa = 1000.0;
	final double mpa_mpa = 1.0;
	//////////////////////////////////////////////////////////////////////////////// 압력 : 25개

	//////////////////////////////////////////////////////////////////////////////// 속도
	//m/s ->
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

	//m/h ->
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

	//km/s ->
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

	//km/h ->
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

	//in/s ->
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

	//in/h ->
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

	//ft/s ->
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

	//ft/h ->
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

	//mi/s ->
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

	//mi/h ->
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

	//kn(노트) ->
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

	//mach(마하) ->
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
	///////////////////////////////////////// 속도 : 144개

    ///////////////////////////////////////// 데이터
	// 테라바이트 : 테라바이트, 페타바이트 : 페타바이트, 엑사바이트 : 엑사바이트

    //비트 ->
	final double bit_bit = 1.0;
	final double bit_byte = 0.125;
	final double bit_kb = 0.000122;
	final double bit_mb = 1.1921e-7;
	final double bit_gb = 1.1642e-10;
	final double bit_tb = 1.1369e-13;
	final double bit_pb = 1.1102e-16;
	final double bit_eb = 1.0842e-19;

	//바이트 ->
	final double byte_bit = 8.0;
	final double byte_byte = 1.0;
	final double byte_kb = 0.000977;
	final double byte_mb = 9.5367e-7;
	final double byte_gb = 9.3132e-10;
	final double byte_tb = 9.0949e-13;
	final double byte_pb = 8.8818e-16;
	final double byte_eb = 8.6736e-19;

	//킬로바이트 ->
	final double kb_bit = 8192.0;
	final double kb_byte = 1024.0;
	final double kb_kb = 1.0;
	final double kb_mb = 0.000977;
	final double kb_gb = 9.5367e-7;
	final double kb_tb = 9.3132e-10;
	final double kb_pb = 9.0949e-13;
	final double kb_eb = 8.8818e-16;

	//메가바이트 ->
	final double mb_bit = 8388608.0;
	final double mb_byte = 1048576.0;
	final double mb_kb = 1024.0;
	final double mb_mb = 1.0;
	final double mb_gb = 0.000977;
	final double mb_tb = 9.5367e-7;
	final double mb_pb = 9.3132e-10;
	final double mb_eb = 9.0949e-13;

	//기가바이트 ->
	final double gb_bit = 8.5899e+9;
	final double gb_byte = 1.0737e+9;
	final double gb_kb = 1048576.0;
	final double gb_mb = 1024.0;
	final double gb_gb = 1.0;
	final double gb_tb = 0.000977;
	final double gb_pb = 9.5367e-7;
	final double gb_eb = 9.3132e-10;

	//테라바이트 ->
	final double tb_bit = 8.7961e+12;
	final double tb_byte = 1.0995e+12;
	final double tb_kb = 1.0737e+9;
	final double tb_mb = 1048576.0;
	final double tb_gb = 1024.0;
	final double tb_tb = 1.0;
	final double tb_pb = 0.000977;
	final double tb_eb = 9.5367e-7;

	//페타바이트 ->
	final double pb_bit = 9.0072e+15;
	final double pb_byte = 1.1259e+15;
	final double pb_kb = 1.0995e+12;
	final double pb_mb = 1.0737e+9;
	final double pb_gb = 1048576;
	final double pb_tb = 1024.0;
	final double pb_pb = 1.0;
	final double pb_eb = 0.000977;

	//엑사바이트 ->
	final double eb_bit = 9.2234e+18;
	final double eb_byte = 1.1529e+18;
	final double eb_kb = 1.1259e+15;
	final double eb_mb = 1.0995e+12;
	final double eb_gb = 1.0737e+9;
	final double eb_tb = 1048576;
	final double eb_pb = 1024.0;
	final double eb_eb = 1.0;
    ///////////////////////////////////////// 데이터 : 64개

	Button beforeChangeBT, afterChangeBT;
	EditText beforeChangeET, afterChangeET;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.unit, container, false);

		beforeChangeBT = (Button) v.findViewById(R.id.beforeChangeBT);
		afterChangeBT = (Button) v.findViewById(R.id.afterChangeBT);
		beforeChangeET = (EditText) v.findViewById(R.id.beforeChangeET);
		afterChangeET = (EditText) v.findViewById(R.id.afterChangeET);

		v.findViewById(R.id.erase).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num0).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num1).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num2).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num3).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num4).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num5).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num6).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num7).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num8).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.num9).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.eraseAll).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.equal).setOnClickListener(new ButtonListener());
		v.findViewById(R.id.dot).setOnClickListener(new ButtonListener());
		beforeChangeBT.setOnClickListener(new ButtonListener());
		afterChangeBT.setOnClickListener(new ButtonListener());

		return v;
	}

    double unitValue, result;
    String temp = "길이";
    String expUnit = "mm";

	final CharSequence[] unitItems = {"길이", "넓이", "무게", "부피", "압력", "속도", "데이터"};

	final CharSequence[] lengthItems = {"밀리미터", "센치미터", "미터", "킬로미터", "인치", "피트", "야드", "마일"};
	final CharSequence[] areaItems = {"제곱미터", "아르", "헥타르", "제곱킬로미터", "제곱피트", "제곱야드", "평"};
	final CharSequence[] weightItems = {"밀리그램", "그램", "킬로그램", "톤", "킬로톤", "그레인", "온스", "파운드"};
	final CharSequence[] volumeItems = {"씨씨", "밀리리터", "리터", "세제곱센치미터", "세제곱미터", "세제곱인치", "세제곱피트", "세제곱야드", "배럴"};
	final CharSequence[] pressureItems = {"기압", "파스칼", "헥토파스칼", "킬로파스칼", "메가파스칼"};
	final CharSequence[] speedItems = {"m/s", "m/h", "km/s", "km/h", "in/s", "in/h", "ft/s", "ft/h", "mi/s", "mi/h", "kn", "mach"};
	final CharSequence[] dataItems = {"비트", "바이트", "킬로바이트", "메가바이트", "기가바이트", "테라바이트", "페타바이트", "엑사바이트"};

	class ButtonListener implements View.OnClickListener {
		public void onClick(View vs) {
			switch (vs.getId()) {
				case R.id.beforeChangeBT:
					alreadyExistResult();
					new AlertDialog.Builder(v.getContext())
					.setTitle("단위")
					.setSingleChoiceItems(unitItems, -1, new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface dialog, int which) {
							if(unitItems[which].toString().equals("길이")) {
								dialog.cancel();
								new AlertDialog.Builder(v.getContext())
								.setTitle(unitItems[which])
								.setSingleChoiceItems(lengthItems, -1, new DialogInterface.OnClickListener() {

									public void onClick(DialogInterface dialog, int which) {
										if(!temp.equals("길이")) {
											afterChangeBT.setText("밀리미터");
											temp = "길이";
										}

										beforeChangeBT.setText(lengthItems[which]);

										dialog.cancel();
									}
								}).show();
							}
							else if(unitItems[which].toString().equals("넓이")) {
								dialog.cancel();
								new AlertDialog.Builder(v.getContext())
										.setTitle(unitItems[which])
										.setSingleChoiceItems(areaItems, -1, new DialogInterface.OnClickListener() {

											public void onClick(DialogInterface dialog, int which) {
												if(!temp.equals("넓이")) {
													afterChangeBT.setText("제곱미터");
													temp = "넓이";
												}

												beforeChangeBT.setText(areaItems[which]);
												dialog.cancel();
											}
										}).show();
							}
							else if(unitItems[which].toString().equals("무게")) {
								dialog.cancel();
								new AlertDialog.Builder(v.getContext())
										.setTitle(unitItems[which])
										.setSingleChoiceItems(weightItems, -1, new DialogInterface.OnClickListener() {

											public void onClick(DialogInterface dialog, int which) {
												if(!temp.equals("무게")) {
													afterChangeBT.setText("밀리그램");
													temp = "무게";
												}
												beforeChangeBT.setText(weightItems[which]);
												dialog.cancel();
											}
										}).show();
							}
							else if(unitItems[which].toString().equals("부피")) {
								dialog.cancel();
								new AlertDialog.Builder(v.getContext())
										.setTitle(unitItems[which])
										.setSingleChoiceItems(volumeItems, -1, new DialogInterface.OnClickListener() {

											public void onClick(DialogInterface dialog, int which) {
												if(!temp.equals("부피")) {
													afterChangeBT.setText("씨씨");
													temp = "부피";
												}
												beforeChangeBT.setText(volumeItems[which]);
												dialog.cancel();
											}
										}).show();
							}
							else if(unitItems[which].toString().equals("압력")) {
								dialog.cancel();
								new AlertDialog.Builder(v.getContext())
										.setTitle(unitItems[which])
										.setSingleChoiceItems(pressureItems, -1, new DialogInterface.OnClickListener() {

											public void onClick(DialogInterface dialog, int which) {
												if(!temp.equals("압력")) {
													afterChangeBT.setText("기압");
													temp = "압력";
												}
												beforeChangeBT.setText(pressureItems[which]);
												dialog.cancel();
											}
										}).show();
							}
							else if(unitItems[which].toString().equals("속도")) {
								dialog.cancel();
								new AlertDialog.Builder(v.getContext())
										.setTitle(unitItems[which])
										.setSingleChoiceItems(speedItems, -1, new DialogInterface.OnClickListener() {

											public void onClick(DialogInterface dialog, int which) {
												if(!temp.equals("속도")) {
													afterChangeBT.setText("m/s");
													temp = "속도";
												}
												beforeChangeBT.setText(speedItems[which]);
												dialog.cancel();
											}
										}).show();
							}
							else if(unitItems[which].toString().equals("데이터")) {
								dialog.cancel();
								new AlertDialog.Builder(v.getContext())
										.setTitle(unitItems[which])
										.setSingleChoiceItems(dataItems, -1, new DialogInterface.OnClickListener() {

											public void onClick(DialogInterface dialog, int which) {
												if(!temp.equals("데이터")) {
													afterChangeBT.setText("비트");
													temp = "데이터";
												}
												beforeChangeBT.setText(dataItems[which]);
												dialog.cancel();
											}
										}).show();
							}
						}
					}).show();
					break;
				case R.id.afterChangeBT:
					alreadyExistResult();
					if(temp.equals("길이")) {
						new AlertDialog.Builder(v.getContext())
						.setTitle("길이")
						.setSingleChoiceItems(lengthItems, -1, new DialogInterface.OnClickListener() {

							public void onClick(DialogInterface dialog, int which) {
								afterChangeBT.setText(lengthItems[which]);
								dialog.cancel();
							}
						}).show();
					}
					else if(temp.equals("넓이")) {
						new AlertDialog.Builder(v.getContext())
								.setTitle("넓이")
								.setSingleChoiceItems(areaItems, -1, new DialogInterface.OnClickListener() {

									public void onClick(DialogInterface dialog, int which) {
										afterChangeBT.setText(areaItems[which]);
										dialog.cancel();
									}
								}).show();
					}
					else if(temp.equals("무게")) {
						new AlertDialog.Builder(v.getContext())
								.setTitle("무게")
								.setSingleChoiceItems(weightItems, -1, new DialogInterface.OnClickListener() {

									public void onClick(DialogInterface dialog, int which) {
										afterChangeBT.setText(weightItems[which]);
										dialog.cancel();
									}
								}).show();
					}
					else if(temp.equals("부피")) {
						new AlertDialog.Builder(v.getContext())
								.setTitle("부피")
								.setSingleChoiceItems(volumeItems, -1, new DialogInterface.OnClickListener() {

									public void onClick(DialogInterface dialog, int which) {
										afterChangeBT.setText(volumeItems[which]);
										dialog.cancel();
									}
								}).show();
					}
					else if(temp.equals("압력")) {
						new AlertDialog.Builder(v.getContext())
								.setTitle("압력")
								.setSingleChoiceItems(pressureItems, -1, new DialogInterface.OnClickListener() {

									public void onClick(DialogInterface dialog, int which) {
										afterChangeBT.setText(pressureItems[which]);
										dialog.cancel();
									}
								}).show();
					}
					else if(temp.equals("속도")) {
						new AlertDialog.Builder(v.getContext())
								.setTitle("속도")
								.setSingleChoiceItems(speedItems, -1, new DialogInterface.OnClickListener() {

									public void onClick(DialogInterface dialog, int which) {
										afterChangeBT.setText(speedItems[which]);
										dialog.cancel();
									}
								}).show();
					}
					else if(temp.equals("데이터")) {
						new AlertDialog.Builder(v.getContext())
								.setTitle("데이터")
								.setSingleChoiceItems(dataItems, -1, new DialogInterface.OnClickListener() {

									public void onClick(DialogInterface dialog, int which) {
										afterChangeBT.setText(dataItems[which]);
										dialog.cancel();
									}
								}).show();
					}
					break;
				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				case R.id.num0: // 0
					alreadyExistResult();

					beforeChangeET.append("0");
					break;
				case R.id.num1: // 1
					alreadyExistResult();

					beforeChangeET.append("1");
					break;
				case R.id.num2: // 2
					alreadyExistResult();

					beforeChangeET.append("2");
					break;
				case R.id.num3: // 3
					alreadyExistResult();

					beforeChangeET.append("3");
					break;
				case R.id.num4: // 4
					alreadyExistResult();

					beforeChangeET.append("4");
					break;
				case R.id.num5: // 5
					alreadyExistResult();

					beforeChangeET.append("5");
					break;
				case R.id.num6: // 6
					alreadyExistResult();

					beforeChangeET.append("6");
					break;
				case R.id.num7: // 7
					alreadyExistResult();

					beforeChangeET.append("7");
					break;
				case R.id.num8: // 8
					alreadyExistResult();

					beforeChangeET.append("8");
					break;
				case R.id.num9: // 9
					alreadyExistResult();

					beforeChangeET.append("9");
					break;
				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


				///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				// 지우기
				case R.id.erase:
					if (beforeChangeET.getText().toString().length() != 0) { // 입력 값이 이미 있을 때
						beforeChangeET.setText(beforeChangeET.getText().toString().substring(0, beforeChangeET.getText().toString().length() - 1));
						afterChangeET.setText("");
					}
					break;

				case R.id.eraseAll:
					beforeChangeET.setText("");
					afterChangeET.setText("");
					break;

				// 점
				case R.id.dot:
					if (beforeChangeET.getText().toString().length() != 0) { // 입력 값이 이미 있을 때
						if (!checkOperator(beforeChangeET.getText().toString()) && !beforeChangeET.getText().toString().endsWith(".") && !checkBrace(beforeChangeET.getText().toString())) {
							String[] inputSplit = beforeChangeET.getText().toString().split("(?<=[(-+*/)])|(?=[(-+*/)])");
							for (int i = 0; i < inputSplit.length; i++) {
								if (!inputSplit[i].equals("+") && !inputSplit[i].equals("-") && !inputSplit[i].equals("*") && !inputSplit[i].equals("/") && !inputSplit[i].equals("(") && !inputSplit[i].equals(")")) {
									if (!inputSplit[i].contains(".")) {
										beforeChangeET.append(".");
										break;
									}
								}
							}
						}
					}
					break;

				case R.id.equal:
                    setExpUnit();

                    if(beforeChangeET.getText().toString().length() != 0) {
                        change();
                        DecimalFormat df = new DecimalFormat("#,###.######");
                        String dfTemp = df.format(result);
                        afterChangeET.setText(dfTemp + "(" + expUnit + ")");
                    }
					break;
			}
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        private void setExpUnit() {
            if(afterChangeBT.getText().toString().equals("밀리미터")) expUnit = "mm";
            else if(afterChangeBT.getText().toString().equals("센치미터")) expUnit = "cm";
            else if(afterChangeBT.getText().toString().equals("미터")) expUnit = "m";
            else if(afterChangeBT.getText().toString().equals("킬로미터")) expUnit = "km";
            else if(afterChangeBT.getText().toString().equals("인치")) expUnit = "in";
            else if(afterChangeBT.getText().toString().equals("피트")) expUnit = "ft";
            else if(afterChangeBT.getText().toString().equals("야드")) expUnit = "yd";
            else if(afterChangeBT.getText().toString().equals("마일")) expUnit = "mile";
            else if(afterChangeBT.getText().toString().equals("제곱미터")) expUnit = "m2";
            else if(afterChangeBT.getText().toString().equals("아르")) expUnit = "a";
            else if(afterChangeBT.getText().toString().equals("헥타르")) expUnit = "ha";
            else if(afterChangeBT.getText().toString().equals("제곱킬로미터")) expUnit = "km2";
            else if(afterChangeBT.getText().toString().equals("제곱피트")) expUnit = "ft2";
            else if(afterChangeBT.getText().toString().equals("제곱야드")) expUnit = "yd2";
            else if(afterChangeBT.getText().toString().equals("평")) expUnit = "p";
            else if(afterChangeBT.getText().toString().equals("밀리그램")) expUnit = "mg";
            else if(afterChangeBT.getText().toString().equals("그램")) expUnit = "g";
            else if(afterChangeBT.getText().toString().equals("킬로그램")) expUnit = "kg";
            else if(afterChangeBT.getText().toString().equals("톤")) expUnit = "t";
            else if(afterChangeBT.getText().toString().equals("킬로톤")) expUnit = "kt";
            else if(afterChangeBT.getText().toString().equals("그레인")) expUnit = "gr";
            else if(afterChangeBT.getText().toString().equals("온스")) expUnit = "oz";
            else if(afterChangeBT.getText().toString().equals("파운드")) expUnit = "lb";
            else if(afterChangeBT.getText().toString().equals("씨씨")) expUnit = "cc";
            else if(afterChangeBT.getText().toString().equals("밀리리터")) expUnit = "ml";
            else if(afterChangeBT.getText().toString().equals("리터")) expUnit = "l";
            else if(afterChangeBT.getText().toString().equals("세제곱센치미터")) expUnit = "cm3";
            else if(afterChangeBT.getText().toString().equals("세제곱미터")) expUnit = "m3";
            else if(afterChangeBT.getText().toString().equals("세제곱인치")) expUnit = "in3";
            else if(afterChangeBT.getText().toString().equals("세제곱피트")) expUnit = "ft3";
            else if(afterChangeBT.getText().toString().equals("세제곱야드")) expUnit = "yd3";
            else if(afterChangeBT.getText().toString().equals("배럴")) expUnit = "bbl";
            else if(afterChangeBT.getText().toString().equals("기압")) expUnit = "atm";
            else if(afterChangeBT.getText().toString().equals("파스칼")) expUnit = "pa";
            else if(afterChangeBT.getText().toString().equals("헥토파스칼")) expUnit = "hpa";
            else if(afterChangeBT.getText().toString().equals("킬로파스칼")) expUnit = "kpa";
            else if(afterChangeBT.getText().toString().equals("메가파스칼")) expUnit = "mpa";
            else if(afterChangeBT.getText().toString().equals("m/s")) expUnit = "m/s";
            else if(afterChangeBT.getText().toString().equals("m/h")) expUnit = "m/h";
            else if(afterChangeBT.getText().toString().equals("km/s")) expUnit = "km/s";
            else if(afterChangeBT.getText().toString().equals("km/h")) expUnit = "km/h";
            else if(afterChangeBT.getText().toString().equals("in/s")) expUnit = "in/s";
            else if(afterChangeBT.getText().toString().equals("in/h")) expUnit = "in/h";
            else if(afterChangeBT.getText().toString().equals("ft/s")) expUnit = "ft/s";
            else if(afterChangeBT.getText().toString().equals("ft/h")) expUnit = "ft/h";
            else if(afterChangeBT.getText().toString().equals("mi/s")) expUnit = "mi/s";
            else if(afterChangeBT.getText().toString().equals("mi/h")) expUnit = "mi/h";
            else if(afterChangeBT.getText().toString().equals("kn")) expUnit = "kn";
            else if(afterChangeBT.getText().toString().equals("mach")) expUnit = "mach";
            else if(afterChangeBT.getText().toString().equals("비트")) expUnit = "bit";
            else if(afterChangeBT.getText().toString().equals("바이트")) expUnit = "byte";
            else if(afterChangeBT.getText().toString().equals("킬로바이트")) expUnit = "kb";
            else if(afterChangeBT.getText().toString().equals("메가바이트")) expUnit = "mb";
            else if(afterChangeBT.getText().toString().equals("기가바이트")) expUnit = "gb";
            else if(afterChangeBT.getText().toString().equals("테라바이트")) expUnit = "tb";
            else if(afterChangeBT.getText().toString().equals("페타바이트")) expUnit = "pb";
            else if(afterChangeBT.getText().toString().equals("엑사바이트")) expUnit = "eb";
        }

		private boolean checkOperator(String value) {
			if (value.endsWith("+") || value.endsWith("-") || value.endsWith("*") || value.endsWith("/"))
				return true;

			return false;
		}

		private boolean checkBrace(String value) {
			if (value.endsWith("(") || value.endsWith(")"))
				return true;

			return false;
		}

		private void alreadyExistResult() {
			if (afterChangeET.getText().toString().length() != 0) { // 결과 값이 이미 있을 때
				beforeChangeET.setText("");
				afterChangeET.setText("");
			}
		}
	}
	private void change() {
		if(beforeChangeBT.getText().toString().equals("밀리미터")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리미터")) {
				unitValue = mm_mm;
			}
			else if(afterChangeBT.getText().toString().equals("센치미터")) {
				unitValue = mm_cm;
			}
			else if(afterChangeBT.getText().toString().equals("미터")) {
				unitValue = mm_m;
			}
			else if(afterChangeBT.getText().toString().equals("킬로미터")) {
				unitValue = mm_km;
			}
			else if(afterChangeBT.getText().toString().equals("인치")) {
				unitValue = mm_in;
			}
			else if(afterChangeBT.getText().toString().equals("피트")) {
				unitValue = mm_ft;
			}
			else if(afterChangeBT.getText().toString().equals("야드")) {
				unitValue = mm_yd;
			}
			else if(afterChangeBT.getText().toString().equals("마일")) {
				unitValue = mm_mile;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("센치미터")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리미터")) {
				unitValue = cm_mm;
			}
			else if(afterChangeBT.getText().toString().equals("센치미터")) {
				unitValue = cm_cm;
			}
			else if(afterChangeBT.getText().toString().equals("미터")) {
				unitValue = cm_m;
			}
			else if(afterChangeBT.getText().toString().equals("킬로미터")) {
				unitValue = cm_km;
			}
			else if(afterChangeBT.getText().toString().equals("인치")) {
				unitValue = cm_in;
			}
			else if(afterChangeBT.getText().toString().equals("피트")) {
				unitValue = cm_ft;
			}
			else if(afterChangeBT.getText().toString().equals("야드")) {
				unitValue = cm_yd;
			}
			else if(afterChangeBT.getText().toString().equals("마일")) {
				unitValue = cm_mile;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("미터")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리미터")) {
				unitValue = m_mm;
			}
			else if(afterChangeBT.getText().toString().equals("센치미터")) {
				unitValue = m_cm;
			}
			else if(afterChangeBT.getText().toString().equals("미터")) {
				unitValue = m_m;
			}
			else if(afterChangeBT.getText().toString().equals("킬로미터")) {
				unitValue = m_km;
			}
			else if(afterChangeBT.getText().toString().equals("인치")) {
				unitValue = m_in;
			}
			else if(afterChangeBT.getText().toString().equals("피트")) {
				unitValue = m_ft;
			}
			else if(afterChangeBT.getText().toString().equals("야드")) {
				unitValue = m_yd;
			}
			else if(afterChangeBT.getText().toString().equals("마일")) {
				unitValue = m_mile;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("킬로미터")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리미터")) {
				unitValue = km_mm;
			}
			else if(afterChangeBT.getText().toString().equals("센치미터")) {
				unitValue = km_cm;
			}
			else if(afterChangeBT.getText().toString().equals("미터")) {
				unitValue = km_m;
			}
			else if(afterChangeBT.getText().toString().equals("킬로미터")) {
				unitValue = km_km;
			}
			else if(afterChangeBT.getText().toString().equals("인치")) {
				unitValue = km_in;
			}
			else if(afterChangeBT.getText().toString().equals("피트")) {
				unitValue = km_ft;
			}
			else if(afterChangeBT.getText().toString().equals("야드")) {
				unitValue = km_yd;
			}
			else if(afterChangeBT.getText().toString().equals("마일")) {
				unitValue = km_mile;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("인치")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리미터")) {
				unitValue = in_mm;
			}
			else if(afterChangeBT.getText().toString().equals("센치미터")) {
				unitValue = in_cm;
			}
			else if(afterChangeBT.getText().toString().equals("미터")) {
				unitValue = in_m;
			}
			else if(afterChangeBT.getText().toString().equals("킬로미터")) {
				unitValue = in_km;
			}
			else if(afterChangeBT.getText().toString().equals("인치")) {
				unitValue = in_in;
			}
			else if(afterChangeBT.getText().toString().equals("피트")) {
				unitValue = in_ft;
			}
			else if(afterChangeBT.getText().toString().equals("야드")) {
				unitValue = in_yd;
			}
			else if(afterChangeBT.getText().toString().equals("마일")) {
				unitValue = in_mile;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("피트")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리미터")) {
				unitValue = ft_mm;
			}
			else if(afterChangeBT.getText().toString().equals("센치미터")) {
				unitValue = ft_cm;
			}
			else if(afterChangeBT.getText().toString().equals("미터")) {
				unitValue = ft_m;
			}
			else if(afterChangeBT.getText().toString().equals("킬로미터")) {
				unitValue = ft_km;
			}
			else if(afterChangeBT.getText().toString().equals("인치")) {
				unitValue = ft_in;
			}
			else if(afterChangeBT.getText().toString().equals("피트")) {
				unitValue = ft_ft;
			}
			else if(afterChangeBT.getText().toString().equals("야드")) {
				unitValue = ft_yd;
			}
			else if(afterChangeBT.getText().toString().equals("마일")) {
				unitValue = ft_mile;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("야드")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리미터")) {
				unitValue = yd_mm;
			}
			else if(afterChangeBT.getText().toString().equals("센치미터")) {
				unitValue = yd_cm;
			}
			else if(afterChangeBT.getText().toString().equals("미터")) {
				unitValue = yd_m;
			}
			else if(afterChangeBT.getText().toString().equals("킬로미터")) {
				unitValue = yd_km;
			}
			else if(afterChangeBT.getText().toString().equals("인치")) {
				unitValue = yd_in;
			}
			else if(afterChangeBT.getText().toString().equals("피트")) {
				unitValue = yd_ft;
			}
			else if(afterChangeBT.getText().toString().equals("야드")) {
				unitValue = yd_yd;
			}
			else if(afterChangeBT.getText().toString().equals("마일")) {
				unitValue = yd_mile;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("마일")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리미터")) {
				unitValue = mile_mm;
			}
			else if(afterChangeBT.getText().toString().equals("센치미터")) {
				unitValue = mile_cm;
			}
			else if(afterChangeBT.getText().toString().equals("미터")) {
				unitValue = mile_m;
			}
			else if(afterChangeBT.getText().toString().equals("킬로미터")) {
				unitValue = mile_km;
			}
			else if(afterChangeBT.getText().toString().equals("인치")) {
				unitValue = mile_in;
			}
			else if(afterChangeBT.getText().toString().equals("피트")) {
				unitValue = mile_ft;
			}
			else if(afterChangeBT.getText().toString().equals("야드")) {
				unitValue = mile_yd;
			}
			else if(afterChangeBT.getText().toString().equals("마일")) {
				unitValue = mile_mile;
			}
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		else if(beforeChangeBT.getText().toString().equals("제곱미터")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("제곱미터")) {
				unitValue = m2_m2;
			}
			else if(afterChangeBT.getText().toString().equals("아르")) {
				unitValue = m2_a;
			}
			else if(afterChangeBT.getText().toString().equals("헥타르")) {
				unitValue = m2_ha;
			}
			else if(afterChangeBT.getText().toString().equals("제곱킬로미터")) {
				unitValue = m2_km2;
			}
			else if(afterChangeBT.getText().toString().equals("제곱피트")) {
				unitValue = m2_ft2;
			}
			else if(afterChangeBT.getText().toString().equals("제곱야드")) {
				unitValue = m2_yd2;
			}
			else if(afterChangeBT.getText().toString().equals("평")) {
				unitValue = m2_p;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("아르")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("제곱미터")) {
				unitValue = a_m2;
			}
			else if(afterChangeBT.getText().toString().equals("아르")) {
				unitValue = a_a;
			}
			else if(afterChangeBT.getText().toString().equals("헥타르")) {
				unitValue = a_ha;
			}
			else if(afterChangeBT.getText().toString().equals("제곱킬로미터")) {
				unitValue = a_km2;
			}
			else if(afterChangeBT.getText().toString().equals("제곱피트")) {
				unitValue = a_ft2;
			}
			else if(afterChangeBT.getText().toString().equals("제곱야드")) {
				unitValue = a_yd2;
			}
			else if(afterChangeBT.getText().toString().equals("평")) {
				unitValue = a_p;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("헥타르")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("제곱미터")) {
				unitValue = ha_m2;
			}
			else if(afterChangeBT.getText().toString().equals("아르")) {
				unitValue = ha_a;
			}
			else if(afterChangeBT.getText().toString().equals("헥타르")) {
				unitValue = ha_ha;
			}
			else if(afterChangeBT.getText().toString().equals("제곱킬로미터")) {
				unitValue = ha_km2;
			}
			else if(afterChangeBT.getText().toString().equals("제곱피트")) {
				unitValue = ha_ft2;
			}
			else if(afterChangeBT.getText().toString().equals("제곱야드")) {
				unitValue = ha_yd2;
			}
			else if(afterChangeBT.getText().toString().equals("평")) {
				unitValue = ha_p;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("제곱킬로미터")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("제곱미터")) {
				unitValue = km2_m2;
			}
			else if(afterChangeBT.getText().toString().equals("아르")) {
				unitValue = km2_a;
			}
			else if(afterChangeBT.getText().toString().equals("헥타르")) {
				unitValue = km2_ha;
			}
			else if(afterChangeBT.getText().toString().equals("제곱킬로미터")) {
				unitValue = km2_km2;
			}
			else if(afterChangeBT.getText().toString().equals("제곱피트")) {
				unitValue = km2_ft2;
			}
			else if(afterChangeBT.getText().toString().equals("제곱야드")) {
				unitValue = km2_yd2;
			}
			else if(afterChangeBT.getText().toString().equals("평")) {
				unitValue = km2_p;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("제곱피트")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("제곱미터")) {
				unitValue = ft2_m2;
			}
			else if(afterChangeBT.getText().toString().equals("아르")) {
				unitValue = ft2_a;
			}
			else if(afterChangeBT.getText().toString().equals("헥타르")) {
				unitValue = ft2_ha;
			}
			else if(afterChangeBT.getText().toString().equals("제곱킬로미터")) {
				unitValue = ft2_km2;
			}
			else if(afterChangeBT.getText().toString().equals("제곱피트")) {
				unitValue = ft2_ft2;
			}
			else if(afterChangeBT.getText().toString().equals("제곱야드")) {
				unitValue = ft2_yd2;
			}
			else if(afterChangeBT.getText().toString().equals("평")) {
				unitValue = ft2_p;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("제곱야드")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("제곱미터")) {
				unitValue = yd2_m2;
			}
			else if(afterChangeBT.getText().toString().equals("아르")) {
				unitValue = yd2_a;
			}
			else if(afterChangeBT.getText().toString().equals("헥타르")) {
				unitValue = yd2_ha;
			}
			else if(afterChangeBT.getText().toString().equals("제곱킬로미터")) {
				unitValue = yd2_km2;
			}
			else if(afterChangeBT.getText().toString().equals("제곱피트")) {
				unitValue = yd2_ft2;
			}
			else if(afterChangeBT.getText().toString().equals("제곱야드")) {
				unitValue = yd2_yd2;
			}
			else if(afterChangeBT.getText().toString().equals("평")) {
				unitValue = yd2_p;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("평")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("제곱미터")) {
				unitValue = p_m2;
			}
			else if(afterChangeBT.getText().toString().equals("아르")) {
				unitValue = p_a;
			}
			else if(afterChangeBT.getText().toString().equals("헥타르")) {
				unitValue = p_ha;
			}
			else if(afterChangeBT.getText().toString().equals("제곱킬로미터")) {
				unitValue = p_km2;
			}
			else if(afterChangeBT.getText().toString().equals("제곱피트")) {
				unitValue = p_ft2;
			}
			else if(afterChangeBT.getText().toString().equals("제곱야드")) {
				unitValue = p_yd2;
			}
			else if(afterChangeBT.getText().toString().equals("평")) {
				unitValue = p_p;
			}
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////

		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		else if(beforeChangeBT.getText().toString().equals("밀리그램")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리그램")) {
				unitValue = mg_mg;
			}
			else if(afterChangeBT.getText().toString().equals("그램")) {
				unitValue = mg_g;
			}
			else if(afterChangeBT.getText().toString().equals("킬로그램")) {
				unitValue = mg_kg;
			}
			else if(afterChangeBT.getText().toString().equals("톤")) {
				unitValue = mg_t;
			}
			else if(afterChangeBT.getText().toString().equals("킬로톤")) {
				unitValue = mg_kt;
			}
			else if(afterChangeBT.getText().toString().equals("그레인")) {
				unitValue = mg_gr;
			}
			else if(afterChangeBT.getText().toString().equals("온스")) {
				unitValue = mg_oz;
			}
			else if(afterChangeBT.getText().toString().equals("파운드")) {
				unitValue = mg_lb;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("그램")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리그램")) {
				unitValue = g_mg;
			}
			else if(afterChangeBT.getText().toString().equals("그램")) {
				unitValue = g_g;
			}
			else if(afterChangeBT.getText().toString().equals("킬로그램")) {
				unitValue = g_kg;
			}
			else if(afterChangeBT.getText().toString().equals("톤")) {
				unitValue = g_t;
			}
			else if(afterChangeBT.getText().toString().equals("킬로톤")) {
				unitValue = g_kt;
			}
			else if(afterChangeBT.getText().toString().equals("그레인")) {
				unitValue = g_gr;
			}
			else if(afterChangeBT.getText().toString().equals("온스")) {
				unitValue = g_oz;
			}
			else if(afterChangeBT.getText().toString().equals("파운드")) {
				unitValue = g_lb;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("킬로그램")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리그램")) {
				unitValue = kg_mg;
			}
			else if(afterChangeBT.getText().toString().equals("그램")) {
				unitValue = kg_g;
			}
			else if(afterChangeBT.getText().toString().equals("킬로그램")) {
				unitValue = kg_kg;
			}
			else if(afterChangeBT.getText().toString().equals("톤")) {
				unitValue = kg_t;
			}
			else if(afterChangeBT.getText().toString().equals("킬로톤")) {
				unitValue = kg_kt;
			}
			else if(afterChangeBT.getText().toString().equals("그레인")) {
				unitValue = kg_gr;
			}
			else if(afterChangeBT.getText().toString().equals("온스")) {
				unitValue = kg_oz;
			}
			else if(afterChangeBT.getText().toString().equals("파운드")) {
				unitValue = kg_lb;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("톤")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리그램")) {
				unitValue = t_mg;
			}
			else if(afterChangeBT.getText().toString().equals("그램")) {
				unitValue = t_g;
			}
			else if(afterChangeBT.getText().toString().equals("킬로그램")) {
				unitValue = t_kg;
			}
			else if(afterChangeBT.getText().toString().equals("톤")) {
				unitValue = t_t;
			}
			else if(afterChangeBT.getText().toString().equals("킬로톤")) {
				unitValue = t_kt;
			}
			else if(afterChangeBT.getText().toString().equals("그레인")) {
				unitValue = t_gr;
			}
			else if(afterChangeBT.getText().toString().equals("온스")) {
				unitValue = t_oz;
			}
			else if(afterChangeBT.getText().toString().equals("파운드")) {
				unitValue = t_lb;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("킬로톤")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리그램")) {
				unitValue = kt_mg;
			}
			else if(afterChangeBT.getText().toString().equals("그램")) {
				unitValue = kt_g;
			}
			else if(afterChangeBT.getText().toString().equals("킬로그램")) {
				unitValue = kt_kg;
			}
			else if(afterChangeBT.getText().toString().equals("톤")) {
				unitValue = kt_t;
			}
			else if(afterChangeBT.getText().toString().equals("킬로톤")) {
				unitValue = kt_kt;
			}
			else if(afterChangeBT.getText().toString().equals("그레인")) {
				unitValue = kt_gr;
			}
			else if(afterChangeBT.getText().toString().equals("온스")) {
				unitValue = kt_oz;
			}
			else if(afterChangeBT.getText().toString().equals("파운드")) {
				unitValue = kt_lb;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("그레인")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리그램")) {
				unitValue = gr_mg;
			}
			else if(afterChangeBT.getText().toString().equals("그램")) {
				unitValue = gr_g;
			}
			else if(afterChangeBT.getText().toString().equals("킬로그램")) {
				unitValue = gr_kg;
			}
			else if(afterChangeBT.getText().toString().equals("톤")) {
				unitValue = gr_t;
			}
			else if(afterChangeBT.getText().toString().equals("킬로톤")) {
				unitValue = gr_kt;
			}
			else if(afterChangeBT.getText().toString().equals("그레인")) {
				unitValue = gr_gr;
			}
			else if(afterChangeBT.getText().toString().equals("온스")) {
				unitValue = gr_oz;
			}
			else if(afterChangeBT.getText().toString().equals("파운드")) {
				unitValue = gr_lb;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("온스")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리그램")) {
				unitValue = oz_mg;
			}
			else if(afterChangeBT.getText().toString().equals("그램")) {
				unitValue = oz_g;
			}
			else if(afterChangeBT.getText().toString().equals("킬로그램")) {
				unitValue = oz_kg;
			}
			else if(afterChangeBT.getText().toString().equals("톤")) {
				unitValue = oz_t;
			}
			else if(afterChangeBT.getText().toString().equals("킬로톤")) {
				unitValue = oz_kt;
			}
			else if(afterChangeBT.getText().toString().equals("그레인")) {
				unitValue = oz_gr;
			}
			else if(afterChangeBT.getText().toString().equals("온스")) {
				unitValue = oz_oz;
			}
			else if(afterChangeBT.getText().toString().equals("파운드")) {
				unitValue = oz_lb;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("파운드")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("밀리그램")) {
				unitValue = lb_mg;
			}
			else if(afterChangeBT.getText().toString().equals("그램")) {
				unitValue = lb_g;
			}
			else if(afterChangeBT.getText().toString().equals("킬로그램")) {
				unitValue = lb_kg;
			}
			else if(afterChangeBT.getText().toString().equals("톤")) {
				unitValue = lb_t;
			}
			else if(afterChangeBT.getText().toString().equals("킬로톤")) {
				unitValue = lb_kt;
			}
			else if(afterChangeBT.getText().toString().equals("그레인")) {
				unitValue = lb_gr;
			}
			else if(afterChangeBT.getText().toString().equals("온스")) {
				unitValue = lb_oz;
			}
			else if(afterChangeBT.getText().toString().equals("파운드")) {
				unitValue = lb_lb;
			}
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		else if(beforeChangeBT.getText().toString().equals("씨씨")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("씨씨")) {
				unitValue = cc_cc;
			}
			else if(afterChangeBT.getText().toString().equals("밀리리터")) {
				unitValue = cc_ml;
			}
			else if(afterChangeBT.getText().toString().equals("리터")) {
				unitValue = cc_l;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱센치미터")) {
				unitValue = cc_cm3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱미터")) {
				unitValue = cc_m3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱인치")) {
				unitValue = cc_in3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱피트")) {
				unitValue = cc_ft3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱야드")) {
				unitValue = cc_yd3;
			}
			else if(afterChangeBT.getText().toString().equals("배럴")) {
				unitValue = cc_bbl;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("밀리리터")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("씨씨")) {
				unitValue = ml_cc;
			}
			else if(afterChangeBT.getText().toString().equals("밀리리터")) {
				unitValue = ml_ml;
			}
			else if(afterChangeBT.getText().toString().equals("리터")) {
				unitValue = ml_l;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱센치미터")) {
				unitValue = ml_cm3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱미터")) {
				unitValue = ml_m3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱인치")) {
				unitValue = ml_in3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱피트")) {
				unitValue = ml_ft3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱야드")) {
				unitValue = ml_yd3;
			}
			else if(afterChangeBT.getText().toString().equals("배럴")) {
				unitValue = ml_bbl;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("리터")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("씨씨")) {
				unitValue = l_cc;
			}
			else if(afterChangeBT.getText().toString().equals("밀리리터")) {
				unitValue = l_ml;
			}
			else if(afterChangeBT.getText().toString().equals("리터")) {
				unitValue = l_l;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱센치미터")) {
				unitValue = l_cm3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱미터")) {
				unitValue = l_m3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱인치")) {
				unitValue = l_in3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱피트")) {
				unitValue = l_ft3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱야드")) {
				unitValue = l_yd3;
			}
			else if(afterChangeBT.getText().toString().equals("배럴")) {
				unitValue = l_bbl;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("세제곱센치미터")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("씨씨")) {
				unitValue = cm3_cc;
			}
			else if(afterChangeBT.getText().toString().equals("밀리리터")) {
				unitValue = cm3_ml;
			}
			else if(afterChangeBT.getText().toString().equals("리터")) {
				unitValue = cm3_l;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱센치미터")) {
				unitValue = cm3_cm3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱미터")) {
				unitValue = cm3_m3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱인치")) {
				unitValue = cm3_in3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱피트")) {
				unitValue = cm3_ft3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱야드")) {
				unitValue = cm3_yd3;
			}
			else if(afterChangeBT.getText().toString().equals("배럴")) {
				unitValue = cm3_bbl;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("세제곱미터")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("씨씨")) {
				unitValue = m3_cc;
			}
			else if(afterChangeBT.getText().toString().equals("밀리리터")) {
				unitValue = m3_ml;
			}
			else if(afterChangeBT.getText().toString().equals("리터")) {
				unitValue = m3_l;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱센치미터")) {
				unitValue = m3_cm3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱미터")) {
				unitValue = m3_m3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱인치")) {
				unitValue = m3_in3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱피트")) {
				unitValue = m3_ft3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱야드")) {
				unitValue = m3_yd3;
			}
			else if(afterChangeBT.getText().toString().equals("배럴")) {
				unitValue = m3_bbl;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("세제곱인치")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("씨씨")) {
				unitValue = in3_cc;
			}
			else if(afterChangeBT.getText().toString().equals("밀리리터")) {
				unitValue = in3_ml;
			}
			else if(afterChangeBT.getText().toString().equals("리터")) {
				unitValue = in3_l;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱센치미터")) {
				unitValue = in3_cm3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱미터")) {
				unitValue = in3_m3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱인치")) {
				unitValue = in3_in3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱피트")) {
				unitValue = in3_ft3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱야드")) {
				unitValue = in3_yd3;
			}
			else if(afterChangeBT.getText().toString().equals("배럴")) {
				unitValue = in3_bbl;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("세제곱피트")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("씨씨")) {
				unitValue = ft3_cc;
			}
			else if(afterChangeBT.getText().toString().equals("밀리리터")) {
				unitValue = ft3_ml;
			}
			else if(afterChangeBT.getText().toString().equals("리터")) {
				unitValue = ft3_l;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱센치미터")) {
				unitValue = ft3_cm3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱미터")) {
				unitValue = ft3_m3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱인치")) {
				unitValue = ft3_in3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱피트")) {
				unitValue = ft3_ft3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱야드")) {
				unitValue = ft3_yd3;
			}
			else if(afterChangeBT.getText().toString().equals("배럴")) {
				unitValue = ft3_bbl;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("세제곱야드")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("씨씨")) {
				unitValue = yd3_cc;
			}
			else if(afterChangeBT.getText().toString().equals("밀리리터")) {
				unitValue = yd3_ml;
			}
			else if(afterChangeBT.getText().toString().equals("리터")) {
				unitValue = yd3_l;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱센치미터")) {
				unitValue = yd3_cm3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱미터")) {
				unitValue = yd3_m3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱인치")) {
				unitValue = yd3_in3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱피트")) {
				unitValue = yd3_ft3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱야드")) {
				unitValue = yd3_yd3;
			}
			else if(afterChangeBT.getText().toString().equals("배럴")) {
				unitValue = yd3_bbl;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("배럴")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("씨씨")) {
				unitValue = bbl_cc;
			}
			else if(afterChangeBT.getText().toString().equals("밀리리터")) {
				unitValue = bbl_ml;
			}
			else if(afterChangeBT.getText().toString().equals("리터")) {
				unitValue = bbl_l;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱센치미터")) {
				unitValue = bbl_cm3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱미터")) {
				unitValue = bbl_m3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱인치")) {
				unitValue = bbl_in3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱피트")) {
				unitValue = bbl_ft3;
			}
			else if(afterChangeBT.getText().toString().equals("세제곱야드")) {
				unitValue = bbl_yd3;
			}
			else if(afterChangeBT.getText().toString().equals("배럴")) {
				unitValue = bbl_bbl;
			}
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		else if(beforeChangeBT.getText().toString().equals("기압")) { /////////////////////////////////////
			if (afterChangeBT.getText().toString().equals("기압")) {
				unitValue = atm_atm;
			} else if (afterChangeBT.getText().toString().equals("파스칼")) {
				unitValue = atm_pa;
			} else if (afterChangeBT.getText().toString().equals("헥토파스칼")) {
				unitValue = atm_hpa;
			} else if (afterChangeBT.getText().toString().equals("킬로파스칼")) {
				unitValue = atm_kpa;
			} else if (afterChangeBT.getText().toString().equals("메가파스칼")) {
				unitValue = atm_mpa;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("파스칼")) { /////////////////////////////////////
			if (afterChangeBT.getText().toString().equals("기압")) {
				unitValue = pa_atm;
			} else if (afterChangeBT.getText().toString().equals("파스칼")) {
				unitValue = pa_pa;
			} else if (afterChangeBT.getText().toString().equals("헥토파스칼")) {
				unitValue = pa_hpa;
			} else if (afterChangeBT.getText().toString().equals("킬로파스칼")) {
				unitValue = pa_kpa;
			} else if (afterChangeBT.getText().toString().equals("메가파스칼")) {
				unitValue = pa_mpa;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("헥토파스칼")) { /////////////////////////////////////
			if (afterChangeBT.getText().toString().equals("기압")) {
				unitValue = hpa_atm;
			} else if (afterChangeBT.getText().toString().equals("파스칼")) {
				unitValue = hpa_pa;
			} else if (afterChangeBT.getText().toString().equals("헥토파스칼")) {
				unitValue = hpa_hpa;
			} else if (afterChangeBT.getText().toString().equals("킬로파스칼")) {
				unitValue = hpa_kpa;
			} else if (afterChangeBT.getText().toString().equals("메가파스칼")) {
				unitValue = hpa_mpa;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("킬로파스칼")) { /////////////////////////////////////
			if (afterChangeBT.getText().toString().equals("기압")) {
				unitValue = kpa_atm;
			} else if (afterChangeBT.getText().toString().equals("파스칼")) {
				unitValue = kpa_pa;
			} else if (afterChangeBT.getText().toString().equals("헥토파스칼")) {
				unitValue = kpa_hpa;
			} else if (afterChangeBT.getText().toString().equals("킬로파스칼")) {
				unitValue = kpa_kpa;
			} else if (afterChangeBT.getText().toString().equals("메가파스칼")) {
				unitValue = kpa_mpa;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("메가파스칼")) { /////////////////////////////////////
			if (afterChangeBT.getText().toString().equals("기압")) {
				unitValue = mpa_atm;
			} else if (afterChangeBT.getText().toString().equals("파스칼")) {
				unitValue = mpa_pa;
			} else if (afterChangeBT.getText().toString().equals("헥토파스칼")) {
				unitValue = mpa_hpa;
			} else if (afterChangeBT.getText().toString().equals("킬로파스칼")) {
				unitValue = mpa_kpa;
			} else if (afterChangeBT.getText().toString().equals("메가파스칼")) {
				unitValue = mpa_mpa;
			}
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		else if(beforeChangeBT.getText().toString().equals("m/s")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("m/s")) {
				unitValue = ms_ms;
			}
			else if(afterChangeBT.getText().toString().equals("m/h")) {
				unitValue = ms_mh;
			}
			else if(afterChangeBT.getText().toString().equals("km/s")) {
				unitValue = ms_kms;
			}
			else if(afterChangeBT.getText().toString().equals("km/h")) {
				unitValue = ms_kmh;
			}
			else if(afterChangeBT.getText().toString().equals("in/s")) {
				unitValue = ms_ins;
			}
			else if(afterChangeBT.getText().toString().equals("in/h")) {
				unitValue = ms_inh;
			}
			else if(afterChangeBT.getText().toString().equals("ft/s")) {
				unitValue = ms_fts;
			}
			else if(afterChangeBT.getText().toString().equals("ft/h")) {
				unitValue = ms_fth;
			}
			else if(afterChangeBT.getText().toString().equals("mi/s")) {
				unitValue = ms_mis;
			}
			else if(afterChangeBT.getText().toString().equals("mi/h")) {
				unitValue = ms_mih;
			}
			else if(afterChangeBT.getText().toString().equals("kn")) {
				unitValue = ms_kn;
			}
			else if(afterChangeBT.getText().toString().equals("mach")) {
				unitValue = ms_mach;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("m/h")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("m/s")) {
				unitValue = mh_ms;
			}
			else if(afterChangeBT.getText().toString().equals("m/h")) {
				unitValue = mh_mh;
			}
			else if(afterChangeBT.getText().toString().equals("km/s")) {
				unitValue = mh_kms;
			}
			else if(afterChangeBT.getText().toString().equals("km/h")) {
				unitValue = mh_kmh;
			}
			else if(afterChangeBT.getText().toString().equals("in/s")) {
				unitValue = mh_ins;
			}
			else if(afterChangeBT.getText().toString().equals("in/h")) {
				unitValue = mh_inh;
			}
			else if(afterChangeBT.getText().toString().equals("ft/s")) {
				unitValue = mh_fts;
			}
			else if(afterChangeBT.getText().toString().equals("ft/h")) {
				unitValue = mh_fth;
			}
			else if(afterChangeBT.getText().toString().equals("mi/s")) {
				unitValue = mh_mis;
			}
			else if(afterChangeBT.getText().toString().equals("mi/h")) {
				unitValue = mh_mih;
			}
			else if(afterChangeBT.getText().toString().equals("kn")) {
				unitValue = mh_kn;
			}
			else if(afterChangeBT.getText().toString().equals("mach")) {
				unitValue = mh_mach;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("kms/s")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("m/s")) {
				unitValue = kms_ms;
			}
			else if(afterChangeBT.getText().toString().equals("m/h")) {
				unitValue = kms_mh;
			}
			else if(afterChangeBT.getText().toString().equals("km/s")) {
				unitValue = kms_kms;
			}
			else if(afterChangeBT.getText().toString().equals("km/h")) {
				unitValue = kms_kmh;
			}
			else if(afterChangeBT.getText().toString().equals("in/s")) {
				unitValue = kms_ins;
			}
			else if(afterChangeBT.getText().toString().equals("in/h")) {
				unitValue = kms_inh;
			}
			else if(afterChangeBT.getText().toString().equals("ft/s")) {
				unitValue = kms_fts;
			}
			else if(afterChangeBT.getText().toString().equals("ft/h")) {
				unitValue = kms_fth;
			}
			else if(afterChangeBT.getText().toString().equals("mi/s")) {
				unitValue = kms_mis;
			}
			else if(afterChangeBT.getText().toString().equals("mi/h")) {
				unitValue = kms_mih;
			}
			else if(afterChangeBT.getText().toString().equals("kn")) {
				unitValue = kms_kn;
			}
			else if(afterChangeBT.getText().toString().equals("mach")) {
				unitValue = kms_mach;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("kmh")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("m/s")) {
				unitValue = kmh_ms;
			}
			else if(afterChangeBT.getText().toString().equals("m/h")) {
				unitValue = kmh_mh;
			}
			else if(afterChangeBT.getText().toString().equals("km/s")) {
				unitValue = kmh_kms;
			}
			else if(afterChangeBT.getText().toString().equals("km/h")) {
				unitValue = kmh_kmh;
			}
			else if(afterChangeBT.getText().toString().equals("in/s")) {
				unitValue = kmh_ins;
			}
			else if(afterChangeBT.getText().toString().equals("in/h")) {
				unitValue = kmh_inh;
			}
			else if(afterChangeBT.getText().toString().equals("ft/s")) {
				unitValue = kmh_fts;
			}
			else if(afterChangeBT.getText().toString().equals("ft/h")) {
				unitValue = kmh_fth;
			}
			else if(afterChangeBT.getText().toString().equals("mi/s")) {
				unitValue = kmh_mis;
			}
			else if(afterChangeBT.getText().toString().equals("mi/h")) {
				unitValue = kmh_mih;
			}
			else if(afterChangeBT.getText().toString().equals("kn")) {
				unitValue = kmh_kn;
			}
			else if(afterChangeBT.getText().toString().equals("mach")) {
				unitValue = kmh_mach;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("in/s")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("m/s")) {
				unitValue = ins_ms;
			}
			else if(afterChangeBT.getText().toString().equals("m/h")) {
				unitValue = ins_mh;
			}
			else if(afterChangeBT.getText().toString().equals("km/s")) {
				unitValue = ins_kms;
			}
			else if(afterChangeBT.getText().toString().equals("km/h")) {
				unitValue = ins_kmh;
			}
			else if(afterChangeBT.getText().toString().equals("in/s")) {
				unitValue = ins_ins;
			}
			else if(afterChangeBT.getText().toString().equals("in/h")) {
				unitValue = ins_inh;
			}
			else if(afterChangeBT.getText().toString().equals("ft/s")) {
				unitValue = ins_fts;
			}
			else if(afterChangeBT.getText().toString().equals("ft/h")) {
				unitValue = ins_fth;
			}
			else if(afterChangeBT.getText().toString().equals("mi/s")) {
				unitValue = ins_mis;
			}
			else if(afterChangeBT.getText().toString().equals("mi/h")) {
				unitValue = ins_mih;
			}
			else if(afterChangeBT.getText().toString().equals("kn")) {
				unitValue = ins_kn;
			}
			else if(afterChangeBT.getText().toString().equals("mach")) {
				unitValue = ins_mach;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("in/h")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("m/s")) {
				unitValue = inh_ms;
			}
			else if(afterChangeBT.getText().toString().equals("m/h")) {
				unitValue = inh_mh;
			}
			else if(afterChangeBT.getText().toString().equals("km/s")) {
				unitValue = inh_kms;
			}
			else if(afterChangeBT.getText().toString().equals("km/h")) {
				unitValue = inh_kmh;
			}
			else if(afterChangeBT.getText().toString().equals("in/s")) {
				unitValue = inh_ins;
			}
			else if(afterChangeBT.getText().toString().equals("in/h")) {
				unitValue = inh_inh;
			}
			else if(afterChangeBT.getText().toString().equals("ft/s")) {
				unitValue = inh_fts;
			}
			else if(afterChangeBT.getText().toString().equals("ft/h")) {
				unitValue = inh_fth;
			}
			else if(afterChangeBT.getText().toString().equals("mi/s")) {
				unitValue = inh_mis;
			}
			else if(afterChangeBT.getText().toString().equals("mi/h")) {
				unitValue = inh_mih;
			}
			else if(afterChangeBT.getText().toString().equals("kn")) {
				unitValue = inh_kn;
			}
			else if(afterChangeBT.getText().toString().equals("mach")) {
				unitValue = inh_mach;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("ft/s")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("m/s")) {
				unitValue = fts_ms;
			}
			else if(afterChangeBT.getText().toString().equals("m/h")) {
				unitValue = fts_mh;
			}
			else if(afterChangeBT.getText().toString().equals("km/s")) {
				unitValue = fts_kms;
			}
			else if(afterChangeBT.getText().toString().equals("km/h")) {
				unitValue = fts_kmh;
			}
			else if(afterChangeBT.getText().toString().equals("in/s")) {
				unitValue = fts_ins;
			}
			else if(afterChangeBT.getText().toString().equals("in/h")) {
				unitValue = fts_inh;
			}
			else if(afterChangeBT.getText().toString().equals("ft/s")) {
				unitValue = fts_fts;
			}
			else if(afterChangeBT.getText().toString().equals("ft/h")) {
				unitValue = fts_fth;
			}
			else if(afterChangeBT.getText().toString().equals("mi/s")) {
				unitValue = fts_mis;
			}
			else if(afterChangeBT.getText().toString().equals("mi/h")) {
				unitValue = fts_mih;
			}
			else if(afterChangeBT.getText().toString().equals("kn")) {
				unitValue = fts_kn;
			}
			else if(afterChangeBT.getText().toString().equals("mach")) {
				unitValue = fts_mach;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("ft/h")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("m/s")) {
				unitValue = fth_ms;
			}
			else if(afterChangeBT.getText().toString().equals("m/h")) {
				unitValue = fth_mh;
			}
			else if(afterChangeBT.getText().toString().equals("km/s")) {
				unitValue = fth_kms;
			}
			else if(afterChangeBT.getText().toString().equals("km/h")) {
				unitValue = fth_kmh;
			}
			else if(afterChangeBT.getText().toString().equals("in/s")) {
				unitValue = fth_ins;
			}
			else if(afterChangeBT.getText().toString().equals("in/h")) {
				unitValue = fth_inh;
			}
			else if(afterChangeBT.getText().toString().equals("ft/s")) {
				unitValue = fth_fts;
			}
			else if(afterChangeBT.getText().toString().equals("ft/h")) {
				unitValue = fth_fth;
			}
			else if(afterChangeBT.getText().toString().equals("mi/s")) {
				unitValue = fth_mis;
			}
			else if(afterChangeBT.getText().toString().equals("mi/h")) {
				unitValue = fth_mih;
			}
			else if(afterChangeBT.getText().toString().equals("kn")) {
				unitValue = fth_kn;
			}
			else if(afterChangeBT.getText().toString().equals("mach")) {
				unitValue = fth_mach;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("mi/s")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("m/s")) {
				unitValue = mis_ms;
			}
			else if(afterChangeBT.getText().toString().equals("m/h")) {
				unitValue = mis_mh;
			}
			else if(afterChangeBT.getText().toString().equals("km/s")) {
				unitValue = mis_kms;
			}
			else if(afterChangeBT.getText().toString().equals("km/h")) {
				unitValue = mis_kmh;
			}
			else if(afterChangeBT.getText().toString().equals("in/s")) {
				unitValue = mis_ins;
			}
			else if(afterChangeBT.getText().toString().equals("in/h")) {
				unitValue = mis_inh;
			}
			else if(afterChangeBT.getText().toString().equals("ft/s")) {
				unitValue = mis_fts;
			}
			else if(afterChangeBT.getText().toString().equals("ft/h")) {
				unitValue = mis_fth;
			}
			else if(afterChangeBT.getText().toString().equals("mi/s")) {
				unitValue = mis_mis;
			}
			else if(afterChangeBT.getText().toString().equals("mi/h")) {
				unitValue = mis_mih;
			}
			else if(afterChangeBT.getText().toString().equals("kn")) {
				unitValue = mis_kn;
			}
			else if(afterChangeBT.getText().toString().equals("mach")) {
				unitValue = mis_mach;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("mi/h")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("m/s")) {
				unitValue = mih_ms;
			}
			else if(afterChangeBT.getText().toString().equals("m/h")) {
				unitValue = mih_mh;
			}
			else if(afterChangeBT.getText().toString().equals("km/s")) {
				unitValue = mih_kms;
			}
			else if(afterChangeBT.getText().toString().equals("km/h")) {
				unitValue = mih_kmh;
			}
			else if(afterChangeBT.getText().toString().equals("in/s")) {
				unitValue = mih_ins;
			}
			else if(afterChangeBT.getText().toString().equals("in/h")) {
				unitValue = mih_inh;
			}
			else if(afterChangeBT.getText().toString().equals("ft/s")) {
				unitValue = mih_fts;
			}
			else if(afterChangeBT.getText().toString().equals("ft/h")) {
				unitValue = mih_fth;
			}
			else if(afterChangeBT.getText().toString().equals("mi/s")) {
				unitValue = mih_mis;
			}
			else if(afterChangeBT.getText().toString().equals("mi/h")) {
				unitValue = mih_mih;
			}
			else if(afterChangeBT.getText().toString().equals("kn")) {
				unitValue = mih_kn;
			}
			else if(afterChangeBT.getText().toString().equals("mach")) {
				unitValue = mih_mach;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("노트")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("m/s")) {
				unitValue = kn_ms;
			}
			else if(afterChangeBT.getText().toString().equals("m/h")) {
				unitValue = kn_mh;
			}
			else if(afterChangeBT.getText().toString().equals("km/s")) {
				unitValue = kn_kms;
			}
			else if(afterChangeBT.getText().toString().equals("km/h")) {
				unitValue = kn_kmh;
			}
			else if(afterChangeBT.getText().toString().equals("in/s")) {
				unitValue = kn_ins;
			}
			else if(afterChangeBT.getText().toString().equals("in/h")) {
				unitValue = kn_inh;
			}
			else if(afterChangeBT.getText().toString().equals("ft/s")) {
				unitValue = kn_fts;
			}
			else if(afterChangeBT.getText().toString().equals("ft/h")) {
				unitValue = kn_fth;
			}
			else if(afterChangeBT.getText().toString().equals("mi/s")) {
				unitValue = kn_mis;
			}
			else if(afterChangeBT.getText().toString().equals("mi/h")) {
				unitValue = kn_mih;
			}
			else if(afterChangeBT.getText().toString().equals("kn")) {
				unitValue = kn_kn;
			}
			else if(afterChangeBT.getText().toString().equals("mach")) {
				unitValue = kn_mach;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("마하")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("m/s")) {
				unitValue = mach_ms;
			}
			else if(afterChangeBT.getText().toString().equals("m/h")) {
				unitValue = mach_mh;
			}
			else if(afterChangeBT.getText().toString().equals("km/s")) {
				unitValue = mach_kms;
			}
			else if(afterChangeBT.getText().toString().equals("km/h")) {
				unitValue = mach_kmh;
			}
			else if(afterChangeBT.getText().toString().equals("in/s")) {
				unitValue = mach_ins;
			}
			else if(afterChangeBT.getText().toString().equals("in/h")) {
				unitValue = mach_inh;
			}
			else if(afterChangeBT.getText().toString().equals("ft/s")) {
				unitValue = mach_fts;
			}
			else if(afterChangeBT.getText().toString().equals("ft/h")) {
				unitValue = mach_fth;
			}
			else if(afterChangeBT.getText().toString().equals("mi/s")) {
				unitValue = mach_mis;
			}
			else if(afterChangeBT.getText().toString().equals("mi/h")) {
				unitValue = mach_mih;
			}
			else if(afterChangeBT.getText().toString().equals("kn")) {
				unitValue = mach_kn;
			}
			else if(afterChangeBT.getText().toString().equals("mach")) {
				unitValue = mach_mach;
			}
		}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		else if(beforeChangeBT.getText().toString().equals("비트")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("비트")) {
				unitValue = bit_bit;
			}
			else if(afterChangeBT.getText().toString().equals("바이트")) {
				unitValue = bit_byte;
			}
			else if(afterChangeBT.getText().toString().equals("킬로바이트")) {
				unitValue = bit_kb;
			}
			else if(afterChangeBT.getText().toString().equals("메가바이트")) {
				unitValue = bit_mb;
			}
			else if(afterChangeBT.getText().toString().equals("기가바이트")) {
				unitValue = bit_gb;
			}
			else if(afterChangeBT.getText().toString().equals("테라바이트")) {
				unitValue = bit_tb;
			}
			else if(afterChangeBT.getText().toString().equals("페타바이트")) {
				unitValue = bit_pb;
			}
			else if(afterChangeBT.getText().toString().equals("엑사바이트")) {
				unitValue = bit_eb;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("바이트")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("비트")) {
				unitValue = byte_bit;
			}
			else if(afterChangeBT.getText().toString().equals("바이트")) {
				unitValue = byte_byte;
			}
			else if(afterChangeBT.getText().toString().equals("킬로바이트")) {
				unitValue = byte_kb;
			}
			else if(afterChangeBT.getText().toString().equals("메가바이트")) {
				unitValue = byte_mb;
			}
			else if(afterChangeBT.getText().toString().equals("기가바이트")) {
				unitValue = byte_gb;
			}
			else if(afterChangeBT.getText().toString().equals("테라바이트")) {
				unitValue = byte_tb;
			}
			else if(afterChangeBT.getText().toString().equals("페타바이트")) {
				unitValue = byte_pb;
			}
			else if(afterChangeBT.getText().toString().equals("엑사바이트")) {
				unitValue = byte_eb;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("킬로바이트")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("비트")) {
				unitValue = kb_bit;
			}
			else if(afterChangeBT.getText().toString().equals("바이트")) {
				unitValue = kb_byte;
			}
			else if(afterChangeBT.getText().toString().equals("킬로바이트")) {
				unitValue = kb_kb;
			}
			else if(afterChangeBT.getText().toString().equals("메가바이트")) {
				unitValue = kb_mb;
			}
			else if(afterChangeBT.getText().toString().equals("기가바이트")) {
				unitValue = kb_gb;
			}
			else if(afterChangeBT.getText().toString().equals("테라바이트")) {
				unitValue = kb_tb;
			}
			else if(afterChangeBT.getText().toString().equals("페타바이트")) {
				unitValue = kb_pb;
			}
			else if(afterChangeBT.getText().toString().equals("엑사바이트")) {
				unitValue = kb_eb;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("메가바이트")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("비트")) {
				unitValue = mb_bit;
			}
			else if(afterChangeBT.getText().toString().equals("바이트")) {
				unitValue = mb_byte;
			}
			else if(afterChangeBT.getText().toString().equals("킬로바이트")) {
				unitValue = mb_kb;
			}
			else if(afterChangeBT.getText().toString().equals("메가바이트")) {
				unitValue = mb_mb;
			}
			else if(afterChangeBT.getText().toString().equals("기가바이트")) {
				unitValue = mb_gb;
			}
			else if(afterChangeBT.getText().toString().equals("테라바이트")) {
				unitValue = mb_tb;
			}
			else if(afterChangeBT.getText().toString().equals("페타바이트")) {
				unitValue = mb_pb;
			}
			else if(afterChangeBT.getText().toString().equals("엑사바이트")) {
				unitValue = mb_eb;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("기가바이트")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("비트")) {
				unitValue = gb_bit;
			}
			else if(afterChangeBT.getText().toString().equals("바이트")) {
				unitValue = gb_byte;
			}
			else if(afterChangeBT.getText().toString().equals("킬로바이트")) {
				unitValue = gb_kb;
			}
			else if(afterChangeBT.getText().toString().equals("메가바이트")) {
				unitValue = gb_mb;
			}
			else if(afterChangeBT.getText().toString().equals("기가바이트")) {
				unitValue = gb_gb;
			}
			else if(afterChangeBT.getText().toString().equals("테라바이트")) {
				unitValue = gb_tb;
			}
			else if(afterChangeBT.getText().toString().equals("페타바이트")) {
				unitValue = gb_pb;
			}
			else if(afterChangeBT.getText().toString().equals("엑사바이트")) {
				unitValue = gb_eb;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("테라바이트")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("비트")) {
				unitValue = tb_bit;
			}
			else if(afterChangeBT.getText().toString().equals("바이트")) {
				unitValue = tb_byte;
			}
			else if(afterChangeBT.getText().toString().equals("킬로바이트")) {
				unitValue = tb_kb;
			}
			else if(afterChangeBT.getText().toString().equals("메가바이트")) {
				unitValue = tb_mb;
			}
			else if(afterChangeBT.getText().toString().equals("기가바이트")) {
				unitValue = tb_gb;
			}
			else if(afterChangeBT.getText().toString().equals("테라바이트")) {
				unitValue = tb_tb;
			}
			else if(afterChangeBT.getText().toString().equals("페타바이트")) {
				unitValue = tb_pb;
			}
			else if(afterChangeBT.getText().toString().equals("엑사바이트")) {
				unitValue = tb_eb;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("페타바이트")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("비트")) {
				unitValue = pb_bit;
			}
			else if(afterChangeBT.getText().toString().equals("바이트")) {
				unitValue = pb_byte;
			}
			else if(afterChangeBT.getText().toString().equals("킬로바이트")) {
				unitValue = pb_kb;
			}
			else if(afterChangeBT.getText().toString().equals("메가바이트")) {
				unitValue = pb_mb;
			}
			else if(afterChangeBT.getText().toString().equals("기가바이트")) {
				unitValue = pb_gb;
			}
			else if(afterChangeBT.getText().toString().equals("테라바이트")) {
				unitValue = pb_tb;
			}
			else if(afterChangeBT.getText().toString().equals("페타바이트")) {
				unitValue = pb_pb;
			}
			else if(afterChangeBT.getText().toString().equals("엑사바이트")) {
				unitValue = pb_eb;
			}
		}
		else if(beforeChangeBT.getText().toString().equals("엑사바이트")) { /////////////////////////////////////
			if(afterChangeBT.getText().toString().equals("비트")) {
				unitValue = eb_bit;
			}
			else if(afterChangeBT.getText().toString().equals("바이트")) {
				unitValue = eb_byte;
			}
			else if(afterChangeBT.getText().toString().equals("킬로바이트")) {
				unitValue = eb_kb;
			}
			else if(afterChangeBT.getText().toString().equals("메가바이트")) {
				unitValue = eb_mb;
			}
			else if(afterChangeBT.getText().toString().equals("기가바이트")) {
				unitValue = eb_gb;
			}
			else if(afterChangeBT.getText().toString().equals("테라바이트")) {
				unitValue = eb_tb;
			}
			else if(afterChangeBT.getText().toString().equals("페타바이트")) {
				unitValue = eb_pb;
			}
			else if(afterChangeBT.getText().toString().equals("엑사바이트")) {
				unitValue = eb_eb;
			}
		}
		result = unitValue * Double.parseDouble(beforeChangeET.getText().toString());
	}
}