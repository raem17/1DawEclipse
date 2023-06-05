import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sctxt = new Scanner(System.in);
		Scanner scnum = new Scanner(System.in);
		Persona datosPersona = new Persona();
		Formacion datosFormacion = new Formacion();
		Puesto datosPuesto = new Puesto();
		
		
		// Persona
		System.out.println("Introduzca su nombre completo:");
		datosPersona.setNombre_completo(sctxt.nextLine());
		
		System.out.println("Introduzca una breve descripción de usted:");
		datosPersona.setDescripcion(sctxt.nextLine());
		
		System.out.println("Introduzca su correo electrónico:");
		datosPersona.setCorreo(sctxt.nextLine());
		
		System.out.println("Introduzca su aptitud 1:");
		datosPersona.setAptitud_1(sctxt.nextLine());
		
		System.out.println("Introduzca su aptitud 2:");
		datosPersona.setAptitud_2(sctxt.nextLine());
		
		System.out.println("Introduzca su aptitud 3:");
		datosPersona.setAptitud_3(sctxt.nextLine());
		
		// Titulación
		System.out.println("Introduzca su tipo de formación académica:");
		datosFormacion.setTipo(sctxt.nextLine());
		
		System.out.println("Introduzca el nombre de su titulación:");
		datosFormacion.setNombre_titulación(sctxt.nextLine());
		
		System.out.println("Introduzca el año en el que finalizó su formación:");
		datosFormacion.setAño_finalizacion(scnum.nextInt());
		
		System.out.println("Introduzca el nombre de la institución académica dónde acabó sus estudios:");
		datosFormacion.setNombre_institucion(sctxt.nextLine());
		
		System.out.println("Introduzca la ciudad de la institución académica:");
		datosFormacion.setCiudad_institucion(sctxt.nextLine());
		
		// Puesto
		System.out.println("Introduzca el nombre de su puesto de trabajo actual:");
		datosPuesto.setNombre_puesto(sctxt.nextLine());
		
		System.out.println("Introduzca el nombre de su empleador actual:");
		datosPuesto.setNombre_empleador(sctxt.nextLine());
		
		System.out.println("Introduzca la comunidad autónoma de su trabajo actual:");
		datosPuesto.setComunidad_autonoma(sctxt.nextLine());
		
		System.out.println("Introduzca la ciudad de su trabajo actual:");
		datosPuesto.setCiudad(sctxt.nextLine());
		
		System.out.println("Introduzca el año de inicio de su trabajo actual:");
		datosPuesto.setAño_inicio(scnum.nextInt());
		
		System.out.println("Introduzca la actividad 1 que desarrolla en su trabajo::");
		datosPuesto.setActividad_1(sctxt.nextLine());
		
		System.out.println("Introduzca la actividad 2 que desarrolla en su trabajo::");
		datosPuesto.setActividad_2(sctxt.nextLine());
		
		System.out.println("Introduzca la actividad 3 que desarrolla en su trabajo::");
		datosPuesto.setActividad_3(sctxt.nextLine());
		
		// 
		generarCurriculumEnHTML(datosPersona, datosFormacion, datosPuesto);
	
		sctxt.close();
	}
	
	public static void generarCurriculumEnHTML (Persona datosPersona, Formacion datosFormacion, Puesto datosPuesto) {
		String ruta = "index.html";
		File archivo = new File(ruta);
		
		if (!archivo.exists()) {
			try {
				archivo.createNewFile();
				System.out.println("Archivo creado.");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false));
			
			bw.write("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "	<title>Curriculum Vitae</title>\r\n"
					+ "	<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "    <div class=\"row\"><div class=\"col-12\"><div class=\"d-flex body-resume\"><div class=\"preview-container js-document-wrap position-relative\" id=\"resumeDoc\"><div class=\"loader-overlay loader-overlay-resume position-absolute d-none\" id=\"resumeLoader\"><div class=\"loader-img\"></div></div><div class=\"spellcheck-notification \"></div><div class=\"\" tabindex=\"\"><div><style type=\"text/css\" id=\"static\">\r\n"
					+ "        @import url('https://fonts.googleapis.com/css?family=Blinker:400,600,700');\r\n"
					+ "        html,body,div,span,applet,object,iframe,h1,h2,h3,h4,h5,h6,p,blockquote,pre,a,abbr,acronym,address,big,cite,code,del,dfn,em,font,img,ins,kbd,q,s,samp,small,strike,strong,sub,sup,tt,var,b,u,i,center,dl,dt,dd,ol,ul,li,fieldset,form,label,legend,table,caption,tbody,tfoot,thead,tr,th,td{margin:0;padding:0;border:0;outline:0;vertical-align:baseline;background:transparent}\r\n"
					+ "        body{background:#FFF;line-height:1;text-align:left;font-feature-settings:\"liga\" 0;-moz-font-feature-settings:\"liga\" off}\r\n"
					+ "        .skn-mlj4 table{border-collapse:collapse;border-spacing:0;font-size:inherit;color:inherit;width:100%}\r\n"
					+ "\r\n"
					+ "        /* START content disc style for LI */\r\n"
					+ "        .skn-mlj4 ul,.skn-mlj4 li{list-style:none;margin:0;padding:0}\r\n"
					+ "        .skn-mlj4 ul li{position:relative;margin:0px;padding-left:10px;padding-bottom:5px}\r\n"
					+ "        .skn-mlj4 ul li:last-child{padding-bottom:0px}\r\n"
					+ "        .skn-mlj4 ul li:before{content:'\\2022';position:absolute;left:0;top:2px;font-family:auto;font-weight:bold}\r\n"
					+ "        /* END content disc style for LI */\r\n"
					+ "\r\n"
					+ "        /* ALNK */\r\n"
					+ "        .skn-mlj4 .adnlLnks .singlecolumn li:before{content:\"\"}\r\n"
					+ "        .skn-mlj4 .adnlLnks ul li{padding-left:22px}\r\n"
					+ "\r\n"
					+ "        .skn-mlj4 .paddedline{display:block}\r\n"
					+ "        .skn-mlj4 .jobline ul{margin-top:6px}\r\n"
					+ "        .skn-mlj4 .degreeGap{margin-top:5px}\r\n"
					+ "        .skn-mlj4 .txt-bold{font-weight:bold}\r\n"
					+ "        .skn-mlj4 .txtItl{font-style:italic}\r\n"
					+ "        .skn-mlj4 .namePara,.skn-mlj4 .adnlLnks,.skn-mlj4 .sectiontitle{display:table;table-layout:fixed;width:100%}\r\n"
					+ "\r\n"
					+ "        .skn-mlj4 .flt-right{float:right}\r\n"
					+ "        .skn-mlj4 .locationGap{color:#10657e}\r\n"
					+ "        .skn-mlj4 .locationGap .txt-bold{font-weight:600}\r\n"
					+ "\r\n"
					+ "        .skn-mlj4{color:#000;line-height:16px;font-variant-ligatures:none;word-wrap:break-word;min-height:792px}\r\n"
					+ "        .skn-mlj4.hmargins{padding-left:30px;padding-right:30px}\r\n"
					+ "        .skn-mlj4 .name{font-weight:bold;padding:0 0 5px 0;text-align:left;color:#fff;font-family:'Blinker';position:relative}\r\n"
					+ "\r\n"
					+ "        /*Section*/\r\n"
					+ "        .skn-mlj4 .section{margin-bottom:5px}\r\n"
					+ "        .skn-mlj4 .section.adnlLnks{border-top:none !important}\r\n"
					+ "        .skn-mlj4 .section.SECTION_CNTC{margin-bottom:0px}\r\n"
					+ "        .skn-mlj4 .parentContainer .section{border-top:1px solid }\r\n"
					+ "        .skn-mlj4 .parentContainer .right-box .section{border-top-color:#10657e}\r\n"
					+ "        .skn-mlj4 .right-box .disclaim .singlecolumn{margin-left:0}\r\n"
					+ "\r\n"
					+ "        /* CNTC */\r\n"
					+ "        .skn-mlj4 .address{text-align:left}\r\n"
					+ "        .skn-mlj4 .parentContainer .left-box .SECTION_CNTC{border-bottom:none}\r\n"
					+ "\r\n"
					+ "        /* Heading */\r\n"
					+ "        .skn-mlj4 .heading{font-weight:700;font-size:14px;text-transform:uppercase;position:relative;color:#000;letter-spacing:.5px;margin-bottom:5px}\r\n"
					+ "        .skn-mlj4 .section .namePara{border-bottom:5px solid #fff;margin-bottom:6px}\r\n"
					+ "        .skn-mlj4 .section .resumeTitle{color:#fff;text-transform:uppercase;letter-spacing:.5px;margin-bottom:5px}\r\n"
					+ "        .skn-mlj4 .parentContainer{min-height:600px;display:table;table-layout:fixed;width:calc(100% + 2 * {$LRMR}px)}\r\n"
					+ "        .skn-mlj4 .userdetail .paddedline{margin-bottom:5px}\r\n"
					+ "\r\n"
					+ "        /* Common style for left and right box */\r\n"
					+ "        .skn-mlj4 .left-box{padding:25px 30px 30px;display:table-cell;position:relative;box-sizing:content-box}\r\n"
					+ "        .skn-mlj4 .topsection .left-box{padding:0}\r\n"
					+ "        .skn-mlj4 .right-box{padding:25px 30px 25px 20px;display:table-cell;vertical-align:middle;position:relative;width:100%}\r\n"
					+ "        .skn-mlj4 .topsection .left-box .section{padding-top:0!important;position:relative}\r\n"
					+ "        .skn-mlj4 .topsection .prflPic .field,.skn-mlj4 .topsection .prflPic .field img{position:absolute!important;left:0;right:0;top:0;bottom:0;margin:auto;height:169px;width:169px}\r\n"
					+ "        .skn-mlj4 .topsection .prflPic{position:relative;overflow:hidden}\r\n"
					+ "        .skn-mlj4 .topsection .prflPic .field img{min-height:169px;min-width:169px;max-height:169px;max-width:169px}\r\n"
					+ "        .skn-mlj4 .prflPic:before{content:'';width:0px;height:0px;position:absolute;border-top:160px solid transparent;border-bottom:160px solid transparent;border-left:160px solid #10657e;top:-105px;right:-24px;transform:rotate(-45deg);z-index:-1}\r\n"
					+ "        .skn-mlj4 .topsection{position:relative}\r\n"
					+ "        .skn-mlj4 .topsection .section{margin-bottom:0}\r\n"
					+ "        .skn-mlj4 .firstparagraph{margin-top:0!important}\r\n"
					+ "        .skn-mlj4 .summary{color:#fff;padding-top:10px;font-weight:600}\r\n"
					+ "        .skn-mlj4 .summary .singlecolumn{margin-left:0!important}\r\n"
					+ "        .skn-mlj4 .left-box .singlecolumn ul{color:#000}\r\n"
					+ "        .skn-mlj4 .right-box .singlecolumn ul{color:#46464e}\r\n"
					+ "        .skn-mlj4 .topsection .right-box,.skn-mlj4 .topsection:before{background-color:#10657e}\r\n"
					+ "        .skn-mlj4 .inner-field ul li:last-child{padding-bottom:5px}\r\n"
					+ "\r\n"
					+ "        /*SVG Icon Style*/\r\n"
					+ "        .skn-mlj4 .iconRow{clear:both;padding-bottom:10px;min-height:17px}\r\n"
					+ "        .skn-mlj4 .iconRow .iconSvg{width:15px;height:15px;float:left;margin-top:2px}\r\n"
					+ "        .skn-mlj4 .iconRow .icoTxt,.skn-mlj4 .iconRow .zipprefix,.skn-mlj4 .iconRow .zipsuffix{margin-left:22px}\r\n"
					+ "        .skn-mlj4 .iconRow svg path.rect,.skn-mlj4 .topshape{fill:#576d7b}\r\n"
					+ "        .skn-mlj4 .topshape{position:relative;top:-1px}\r\n"
					+ "        .skn-mlj4 .iconRow path{fill:#343b40}\r\n"
					+ "\r\n"
					+ "        /* Handling background color of left/right box */\r\n"
					+ "        .skn-mlj4 .left-box:before{content:'';height:100%;left:0;top:0;opacity:.25;background-color:#10657e}\r\n"
					+ "        .skn-mlj4 .parentContainer .left-box:after{background-color:#10657e;content:'';position:absolute;width:100%;height:1px;top:0px;left:0px;opacity:.2}\r\n"
					+ "\r\n"
					+ "        /* Warning- Do not change below line keep it as it is because there is replace code in ExportProcess file for this line */\r\n"
					+ "        .skn-mlj4 .left-box:before{position:absolute;width:100%}\r\n"
					+ "        .skn-mlj4 .parentContainer .right-box{vertical-align:top}\r\n"
					+ "\r\n"
					+ "        /*Infographic left box*/\r\n"
					+ "        .skn-mlj4 .left-box .ratingBar:before{content:'';position:absolute;height:3px;width:100%;left:0;top:0;background:#fff}\r\n"
					+ "        .skn-mlj4 .left-box .lang-sec .paragraph,.skn-mlj4 .left-box .infoSec .paragraph{display:block;margin-right:0!important}\r\n"
					+ "        .skn-mlj4 .left-box .lang-sec .paragraph, .skn-mlj4 .left-box .lang-sec .paragraph .emptyWidthDiv, .skn-mlj4 .left-box .lang-sec .paragraph .emptyBarDiv + .emptyWidthDiv{max-width:100%!important}\r\n"
					+ "\r\n"
					+ "        /*New logic for infographic*/\r\n"
					+ "        .skn-mlj4 .lang-sec .singlecolumn,.skn-mlj4 .skli-sec .singlecolumn{display:none}\r\n"
					+ "        .skn-mlj4 .lang-sec.infobarsec .infobarpara,.skn-mlj4 .lang-sec.infotilesec .infotilepara,.skn-mlj4 .skli-sec.infobarsec .infobarpara,.skn-mlj4 .skli-sec.infotilesec .infotilepara{display:block}\r\n"
					+ "\r\n"
					+ "        /*Infographic*/\r\n"
					+ "        .skn-mlj4 .lang-sec.infobarsec,.skn-mlj4 .skli-sec.infobarsec{font-size:0}\r\n"
					+ "        .skn-mlj4 .lang-sec.infobarsec .field *,.skn-mlj4 .skli-sec.infobarsec .field *,.skn-mlj4 .lang-sec.infobarsec .nativeLangPara .field{display:inline}\r\n"
					+ "        .skn-mlj4 .lang-sec.infobarsec .paragraph,.skn-mlj4 .skli-sec.infobarsec .paragraph{display:inline-block;vertical-align:top;padding-bottom:5px;margin-top:0}\r\n"
					+ "        .skn-mlj4 .lang-sec.infobarsec .singlecolumn,.skn-mlj4 .skli-sec.infobarsec .singlecolumn{margin-left:0!important;padding-left:0;position:relative}\r\n"
					+ "        .skn-mlj4 .right-box .lang-sec.infobarsec .para_odd,.skn-mlj4 .right-box .skli-sec.infobarsec .para_odd{margin-right:15px}\r\n"
					+ "        .skn-mlj4 .lang-sec.infobarsec > .paragraph:nth-last-child(1),.skn-mlj4 .right-box .lang-sec.infobarsec > .paragraph:nth-last-child(2),.skn-mlj4 .skli-sec.infobarsec > .paragraph:nth-last-child(1),.skn-mlj4 .right-box .skli-sec.infobarsec > .paragraph:nth-last-child(2){padding-bottom:0!important}\r\n"
					+ "        .skn-mlj4 .lang-sec.infobarsec .nativeLangPara{width:100%!important}\r\n"
					+ "        .skn-mlj4 .right-box .lang-sec.infobarsec .inner-rating{position:relative}\r\n"
					+ "        .skn-mlj4 .lang-sec.infobarsec .rating-bar,.skn-mlj4 .skli-sec.infobarsec .rating-bar{background:#d5d6d6;width:100%;clear:both;margin-top:3px;position:relative;page-break-inside:avoid}\r\n"
					+ "        .skn-mlj4 .lang-sec.infobarsec .inner-rating,.skn-mlj4 .skli-sec.infobarsec .inner-rating{background-color:#10657e;height:4px;position:relative;width:60%}\r\n"
					+ "        .skn-mlj4 .left-box .lang-sec.infobarsec .paragraph,.skn-mlj4 .left-box .skli-sec.infobarsec .paragraph{display:block;margin-right:0!important;width:100%!important;max-width:100%!important}\r\n"
					+ "        .skn-mlj4 .left-box .lang-sec.infobarsec .rating-bar,.skn-mlj4 .left-box .skli-sec.infobarsec .rating-bar{background:#fff}\r\n"
					+ "\r\n"
					+ "        .skn-mlj4 .left-box .skli-sec .paragraph:last-child .singlecolumn  .field:last-child{min-height:0}\r\n"
					+ "		.skn-mlj4 .right-box .skli-sec .paragraph:nth-last-child(1) .singlecolumn .field:last-child,.skn-mlj4 .right-box .skli-sec .paragraph:nth-last-child(2) .singlecolumn .field:last-child{min-height:0}\r\n"
					+ "\r\n"
					+ "        /*Infographic Tiles*/\r\n"
					+ "        .skn-mlj4 .lang-sec.infotilesec,.skn-mlj4 .skli-sec{font-size:0}\r\n"
					+ "        .skn-mlj4 .lang-sec.infotilesec .paragraph,.skn-mlj4 .skli-sec .paragraph{display:inline-block;vertical-align:top;padding-bottom:5px;margin-top:0}\r\n"
					+ "        .skn-mlj4 .lang-sec.infotilesec > .paragraph:nth-last-child(1),.skn-mlj4 .right-box .lang-sec.infotilesec > .paragraph:nth-last-child(2),.skn-mlj4 .skli-sec > .paragraph:nth-last-child(1),.skn-mlj4 .right-box .skli-sec > .paragraph:nth-last-child(2){padding-bottom:0!important}\r\n"
					+ "        .skn-mlj4 .lang-sec.infotilesec .field *,.skn-mlj4 .skli-sec .field *,.skn-mlj4 .lang-sec.infotilesec .nativeLangPara .field{display:inline}\r\n"
					+ "        .skn-mlj4 .lang-sec.infotilesec .singlecolumn,.skn-mlj4 .skli-sec .singlecolumn{margin-left:0!important}\r\n"
					+ "        .skn-mlj4 .lang-sec.infotilesec .sliced-rect,.skn-mlj4 .skli-sec .sliced-rect{height:6px;width:100%;line-height:0px;margin-top:3px;clear:both}\r\n"
					+ "        .skn-mlj4 .right-box .lang-sec.infotilesec .paragraph.para_odd,.skn-mlj4 .right-box .skli-sec .paragraph.para_odd{margin-right:15px}\r\n"
					+ "        .skn-mlj4 .left-box .lang-sec.infotilesec .paragraph,.skn-mlj4 .left-box .skli-sec .paragraph{width:100%;max-width:100%!important;margin-top:0}\r\n"
					+ "        .skn-mlj4 .lang-sec.infotilesec .sliced-rect .sliced-rect-tile,.skn-mlj4 .skli-sec .sliced-rect .sliced-rect-tile{height:100%;background-color:#d5d6d6;float:left;margin-right:3px}\r\n"
					+ "        .skn-mlj4 .lang-sec.infotilesec .sliced-rect .sliced-rect-tile:last-child,.skn-mlj4 .skli-sec .sliced-rect .sliced-rect-tile:last-child{margin-right:0}\r\n"
					+ "        .skn-mlj4 .left-box .lang-sec.infotilesec .sliced-rect .sliced-rect-tile,.skn-mlj4 .left-box .skli-sec .sliced-rect .sliced-rect-tile{background:#fff;position:relative}\r\n"
					+ "\r\n"
					+ "        /*Rectangular Rating Blocks*/\r\n"
					+ "        .skn-mlj4 .sliced-rect .sliced-rect-tile.ratvfill{background-color:#10657e}\r\n"
					+ "        .skn-mlj4 .hide-bar .rating-bar,.skn-mlj4 .hide-bar .sliced-rect,.skn-mlj4 .hide-colon .colon,.skn-mlj4 .hide-only-bar .rating-bar{display:none!important}\r\n"
					+ "\r\n"
					+ "        .skn-mlj4 .right-box .lang-sec.infotilesec .paragraph.firstparagraph,.skn-mlj4 .right-box .lang-sec.infotilesec .paragraph.firstparagraph + .paragraph,.skn-mlj4 .right-box .skli-sec .paragraph.firstparagraph,.skn-mlj4 .right-box .skli-sec .paragraph.firstparagraph + .paragraph{margin-top:0!important}\r\n"
					+ "        .skn-mlj4 .left-box .lang-sec.infobarsec .paragraph{max-width:100%!important}\r\n"
					+ "        .skn-mlj4 .left-box .lang-sec.infobarsec .paragraph{margin-top:0}\r\n"
					+ "\r\n"
					+ "        /*MFR address*/\r\n"
					+ "        .skn-mlj4 .zipsuffix,.skn-mlj4.MFR .zipprefix,.skn-mlj4.MES .zipprefix{display:block}\r\n"
					+ "        .skn-mlj4 .zipprefix,.skn-mlj4.MFR .zipsuffix,.skn-mlj4.MES .zipsuffix{display:none;margin:0pt;padding:0pt}\r\n"
					+ "\r\n"
					+ "        .skn-mlj4 .right-box > .section:not(.SECTION_PPDT_SGTR):nth-last-child(1){margin-bottom:0!important}\r\n"
					+ "        .skn-mlj4 .parentContainer .disclaim{border-top:none;padding-top:50px!important;margin-bottom:0!important}\r\n"
					+ "        .skn-mlj4 .disclaim .singlecolumn{font-size:9px!important;color:#8a8a8a!important}\r\n"
					+ "\r\n"
					+ "        .skn-mlj4 .iconSvg.social svg path{fill:transparent}\r\n"
					+ "        .skn-mlj4 .social svg path.svg-inricon{fill:transparent}\r\n"
					+ "        .skn-mlj4 .social svg path.svg-fillsqrbg{fill:#343b40}\r\n"
					+ "        /* GRYR */\r\n"
					+ "        .skn-mlj4 .displayNoneThisField{display:none}/* Keep this class always at bottom */\r\n"
					+ "    </style><style type=\"text/css\" id=\"dynamic\" data-time=\"Tue Mar 14 2023 13:36:45 GMT+0100 (hora estándar de Europa central)\">\r\n"
					+ "        .skn-mlj4,.skn-mlj4 table{line-height:12px}\r\n"
					+ "        .skn-mlj4.pagesize{width:535px}\r\n"
					+ "        .skn-mlj4.fontsize,.skn-mlj4 .lang-sec.infobarsec .paragraph *,.skn-mlj4 .lang-sec.infotilesec .paragraph *,.skn-mlj4 .skli-sec .paragraph *{font-size:10px}\r\n"
					+ "        .skn-mlj4.fontface{font-family:Blinker}\r\n"
					+ "        .skn-mlj4.hmargins{padding-left:30px;padding-right:30px}\r\n"
					+ "        .skn-mlj4 .section{margin-bottom:25px}\r\n"
					+ "        .skn-mlj4 .paragraph{margin-top:15px}\r\n"
					+ "        .skn-mlj4 .right-box .singlecolumn,.skn-mlj4 .right-box .maincolumn{margin-left:0px}\r\n"
					+ "        .skn-mlj4 .adnlLnks .singlecolumn{margin-left:0}\r\n"
					+ "        .skn-mlj4 table.skills td{padding-top:7px}\r\n"
					+ "        .skn-mlj4 .name{font-size:28px;line-height:35px}\r\n"
					+ "        .skn-mlj4 .address,.skn-mlj4 .adnlLnks{font-size:10px;line-height:12px;position:relative}\r\n"
					+ "        .skn-mlj4 .address2{font-size:10px;line-height:12px}\r\n"
					+ "        .skn-mlj4 .resumeTitle{font-size:16px;line-height:17px}\r\n"
					+ "        .skn-mlj4 .heading{font-size:14px;line-height:17px}\r\n"
					+ "        .skn-mlj4 .left-box,.skn-mlj4 .left-box .firstparagraph{width:164px}\r\n"
					+ "        .skn-mlj4 .parentContainer .left-box{max-width:164px}\r\n"
					+ "        .skn-mlj4 .topsection,.skn-mlj4 .parentContainer{margin-left:-30px!important;margin-right:-30px!important}\r\n"
					+ "        .skn-mlj4 .topsection .right-box,.skn-mlj4 .left-box:before,.skn-mlj4 .parentContainer .left-box:after{background-color:#10657e}\r\n"
					+ "        .skn-mlj4 .parentContainer .right-box .section{border-top-color:#10657e}\r\n"
					+ "        .skn-mlj4 .parentContainer{width:calc(100% + 2 * 30px)}\r\n"
					+ "        .skn-mlj4 .prflPic:before{border-left-color:#10657e}\r\n"
					+ "        .skn-mlj4 .SECTION_CNTC + .section:not(.adnlLnks){margin-top:15px}\r\n"
					+ "        .skn-mlj4 .iconRow{line-height:12px}\r\n"
					+ "        .skn-mlj4 .locationGap{color:#10657e}\r\n"
					+ "\r\n"
					+ "        /*Infographic*/\r\n"
					+ "        .skn-mlj4 .right-box .lang-sec.infobarsec .paragraph,.skn-mlj4 .right-box .skli-sec.infobarsec .paragraph{width:150px}\r\n"
					+ "        .skn-mlj4 .right-box .lang-sec.infobarsec,.skn-mlj4 .right-box .skli-sec.infobarsec{padding-left:0px}\r\n"
					+ "        .skn-mlj4 .right-box .lang-sec.infobarsec .heading,.skn-mlj4 .right-box .skli-sec.infobarsec .heading{margin-left:-0px}\r\n"
					+ "        .skn-mlj4 .lang-sec.infobarsec .inner-rating,.skn-mlj4 .skli-sec.infobarsec .inner-rating{background-color:#10657e}\r\n"
					+ "        .skn-mlj4 .left-box .lang-sec.infobarsec .paragraph,.skn-mlj4 .left-box .skli-sec.infobarsec .paragraph{padding-bottom:7px}\r\n"
					+ "        .skn-mlj4 .lang-sec.infobarsec .nativeLangPara{width:318px!important;max-width:318px}\r\n"
					+ "        .skn-mlj4 .skli-sec .singlecolumn .field:last-child{min-height:13px}\r\n"
					+ "        \r\n"
					+ "        /*Infographic Skills*/\r\n"
					+ "        .skn-mlj4 .right-box .lang-sec.infotilesec,.skn-mlj4 .right-box .skli-sec{padding-left:0px}\r\n"
					+ "        .skn-mlj4 .right-box .lang-sec.infotilesec .heading,.skn-mlj4 .right-box .skli-sec .heading{margin-left:-0px}\r\n"
					+ "        .skn-mlj4 .right-box .lang-sec.infotilesec .paragraph,.skn-mlj4 .right-box .skli-sec .paragraph{width:150px}\r\n"
					+ "        .skn-mlj4 .left-box .lang-sec.infotilesec .paragraph,.skn-mlj4 .left-box .skli-sec .paragraph{padding-bottom:7px}\r\n"
					+ "        .skn-mlj4 .right-box .lang-sec.infotilesec .nativeLangPara{width:318px!important;max-width:318px}\r\n"
					+ "\r\n"
					+ "        /*Rectangular Rating Blocks*/\r\n"
					+ "        .skn-mlj4 .paragraph .sliced-rect .sliced-rect-tile.ratvfill{background-color:#10657e !important}\r\n"
					+ "\r\n"
					+ "        /*fixes for builder*/\r\n"
					+ "        .skn-mlj4.MFR .parentContainer .left-box,.skn-mlj4.MES .parentContainer .left-box{max-width:164px;box-sizing:content-box}\r\n"
					+ "        .skn-mlj4 .data-NAME:hover .name,.skn-mlj4 .data-SUMM:hover .summary{color:#000}\r\n"
					+ "        .skn-mlj4 .sortable-item .prflPic:before{border-top:160px solid #10657e;border-bottom:158px solid transparent;top:-103px;right:-25px}\r\n"
					+ "        .skn-mlj4 .sortable-item.active .prflPic .field:after{content:'';width:0px;height:0px;position:absolute;border-top:159px solid transparent;border-bottom:159px solid transparent;border-right:159px solid #10657e;opacity:.25;top:-18px;right:61px;transform:rotate(-45deg);z-index:-1}\r\n"
					+ "        .skn-mlj4 .topsection .left-box .sortable-item .prflPic{overflow:hidden}\r\n"
					+ "\r\n"
					+ "        /*Builder Infographic*/\r\n"
					+ "        .skn-mlj4 .right-box .lang-sec .sortable-item + .sortable-item .paragraph{width:150px}\r\n"
					+ "        .skn-mlj4 .lang-sec .sortable-item .para_odd,.skn-mlj4 .lang-sec .sortable-item .para_even,.skn-mlj4 .right-box .lang-sec .sortable-item .firstparagraph:not(.para_odd):not(.para_even){padding-bottom:5px}\r\n"
					+ "        .skn-mlj4 .right-box .lang-sec .sortable-item:nth-last-child(1) .paragraph, .skn-mlj4 .right-box .lang-sec .sortable-item:nth-last-child(2) .paragraph{padding-bottom:0}\r\n"
					+ "        .skn-mlj4 .left-box .lang-sec .sortable-item .paragraph{padding-bottom:7px}\r\n"
					+ "        .skn-mlj4 .left-box .lang-sec .sortable-item{display:block!important}\r\n"
					+ "        .skn-mlj4 .left-box .lang-sec .sortable-item .paragraph{margin-right:0!important}\r\n"
					+ "        .skn-mlj4 .right-box .lang-sec .sortable-item{display:inline-block}\r\n"
					+ "\r\n"
					+ "        /*LPL*/\r\n"
					+ "        .page-final .skn-mlj4.LPL .topsection .left-box .sortable-item .prflPic{position:relative}\r\n"
					+ "        .page-final .MLJ4.LPL .topsection .left-box>.sortable-item:first-child .section{margin:0}\r\n"
					+ "        .page-final .skn-mlj4.LPL .sortable-item .prflPic:before{border-top-color:#10657e;border-left-color:#10657e}\r\n"
					+ "        .skn-mlj4 .sortable-item .address:last-child:not(.userdetail) .iconRow:last-child{padding-bottom:0}\r\n"
					+ "        .skn-mlj4 .sortable-item.data-CNTC + .sortable-item:not(.data-ALNK){padding-top:25px}\r\n"
					+ "        .skn-mlj4 .sortable-item .userdetail.address .iconRow:last-child{padding-bottom:0}\r\n"
					+ "        .skn-mlj4 .clearfix .iconRow .iconSvg{margin-top:1px}\r\n"
					+ "        .skn-mlj4 .sortable-item .prflPic:before{top:-103px;right:-25px;border-top-width:160px;border-bottom-width:158px;border-left-width:160px}\r\n"
					+ "\r\n"
					+ "        @-moz-document url-prefix() {\r\n"
					+ "        .skn-mlj4 .parentContainer{height:600px}\r\n"
					+ "        .skn-mlj4 .sortable-item .prflPic:before{content:'';height:0;width:0;position:absolute;right:0px;top:0;border-top:224px solid #10657e;border-left:224px solid transparent;border-right:224px transparent;transform:rotate(0deg);z-index:-1}\r\n"
					+ "        .skn-mlj4 .sortable-item .prflPic:before{border-top-color:#10657e}\r\n"
					+ "        :not(.page-finalize) .skn-mlj4 .sortable-item .prflPic:before{right:-2px;border-top-width:226px;border-right-width:226px;border-left-width:226px}\r\n"
					+ "        .skn-mlj4 .parentContainer .left-box::after{height:2px}\r\n"
					+ "\r\n"
					+ "        /*LPL And LIT*/\r\n"
					+ "        .page-final .skn-mlj4.LPL .sortable-item .prflPic:before{transform:rotate(-45deg)!important;top:-150px!important;right:-45px!important;background:#10657e}\r\n"
					+ "        .resume-preview .skn-mlj4.LPL .sortable-item .prflPic:before{border-top-width:225px;border-bottom-width:223px;border-left-width:225px;transform:rotate(0deg)!important;right:-1px;top:0}\r\n"
					+ "        }\r\n"
					+ "        .skn-mlj4 .topsection .prflPic .field,.skn-mlj4 .topsection .prflPic .field img{height:169px;width:169px}\r\n"
					+ "        .skn-mlj4 .topsection .prflPic .field img{min-height:169px;min-width:169px;max-height:169px;max-width:169px}\r\n"
					+ "        .skn-mlj4 .left-box{padding:25px 30px 30px}\r\n"
					+ "        .skn-mlj4 .right-box{padding:25px 30px 25px 20px}\r\n"
					+ "        .page-final .skn-mlj4 .topsection .left-box{}\r\n"
					+ "        .skn-mlj4 .topsection .left-box .section{padding-top:0!important;position:relative;min-height:224px;width:224px}\r\n"
					+ "        .skn-mlj4 .topsection .left-box .section .paragraph,.skn-mlj4 .topsection .prflPic{height:224px;width:224px}\r\n"
					+ "        .skn-mlj4 .topsection .left-box > .sortable-item:first-child .section{padding-top:0!important;position:relative}\r\n"
					+ "        .page-choose-template-exp .skn-mlj4 .topsection .left-box > .sortable-item:first-child .section,.resume-preview .skn-mlj4 .topsection .left-box > .sortable-item:first-child .section{height:223px;width:223px}\r\n"
					+ "        \r\n"
					+ "        /*Fixes for builder for skill*/\r\n"
					+ "        .skn-mlj4 .skli-sec .sortable-item .paragraph:last-child .singlecolumn .field:last-child{min-height:13px}	\r\n"
					+ "        .skn-mlj4 .right-box .skli-sec .sortable-item:nth-last-child(1) .paragraph .singlecolumn .field:last-child,.skn-mlj4 .right-box .skli-wrapsec .sortable-item:nth-last-child(2) .paragraph .singlecolumn .field:last-child{min-height:0}	\r\n"
					+ "        .skn-mlj4 .lang-sec .sortableInner > .sortable-item:nth-last-child(1) .paragraph, .right-box .skn-mlj4 .lang-sec .sortableInner > .sortable-item:nth-last-child(2) .paragraph, .skn-mlj4  .right-box .skli-sec .sortableInner > .sortable-item:nth-last-child(1) .paragraph, .skn-mlj4 .right-box .skli-sec .sortableInner > .sortable-item:nth-last-child(2) .paragraph{padding-bottom:0!important}\r\n"
					+ "\r\n"
					+ "        @media screen and (min-width:0\\0) {\r\n"
					+ "        .skn-mlj4 .topsection,.skn-mlj4 .parentContainer{display:flex}\r\n"
					+ "        .skn-mlj4 .topsection:before{background-color:#10657e}\r\n"
					+ "        .skn-mlj4 .topsection .left-box{width:224px}\r\n"
					+ "        .skn-mlj4 .right-box{width:calc(100% - 274px)}\r\n"
					+ "        .skn-mlj4 .left-box,.skn-mlj4 .right-box{display:inline;box-sizing:content-box}\r\n"
					+ "        .skn-mlj4 .left-box{min-height:inherit}\r\n"
					+ "        .skn-mlj4 .sortable-item .prflPic::before{top:-104px;right:-26px}\r\n"
					+ "        }\r\n"
					+ "    </style></div><div class=\"document doc-root fontsize fontface vmargins hmargins   pagesize skn-mlj4 MLJ4  MES \" docskinwidth=\"535\" data-color=\"\"><div id=\"CONTAINER_PARENT_0\" class=\"topsection\"><div id=\"CONTAINER_0\" class=\"left-box\"><div data-react-beautiful-dnd-draggable=\"6\" class=\"sortable-item section-container SortableItem-sibling data-PICT\"><div class=\"document-tool sec-tool\" id=\"editIcons\" style=\"right: -37px;\"></div><div id=\"SECTION_PICT9b3d54e2-b443-415b-896d-83d507c69866\" class=\"section notdraggable SECTION_PICT firstsection   \" data-section-cd=\"PICT\"><div class=\" doc-item\"><div class=\"\"><div class=\"\"><div id=\"PARAGRAPH_PICT_371166e3-e0b8-4d90-94f8-5c6b3cfbd82f\" class=\"paragraph PARAGRAPH_PICT firstparagraph placeholder-text \"><div class=\"clearfix doc-item\">\r\n"
					+ "                        <div class=\"clear\"></div>\r\n"
					+ "                    </div><div class=\"doc-overlay para-overlay\" style=\"left:-37px; right: -37px;\"><span class=\"badge badge-primary badge-edit\"></span><span>&nbsp;</span></div></div></div></div></div><div class=\"doc-overlay section-overlay\" style=\"left:-37px; right: -37px;\"><span>&nbsp;</span></div></div></div></div><div id=\"CONTAINER_1\" class=\"right-box\"><div data-react-beautiful-dnd-draggable=\"6\" class=\"sortable-item section-container SortableItem-sibling data-NAME\"><div class=\"document-tool sec-tool\" id=\"editIcons\" style=\"right: -37px;\"><button class=\"btn btn-icon-tertiary btn-icon-edit\" type=\"button\" title=\"Editar\"><i class=\"icon-edit\"></i></button></div><div id=\"SECTION_NAMEd6266c76-76de-4d11-aed3-a9fa3154a0ac\" class=\"section notdraggable SECTION_NAME firstsection   \" data-section-cd=\"NAME\"><div class=\" doc-item\"><div class=\"\"><div class=\"\"><div id=\"PARAGRAPH_NAME_89a0a490-9485-4c4c-8146-f6699c4021b9\" class=\"paragraph namePara PARAGRAPH_NAME firstparagraph placeholder-text \"><div>\r\n"
					+ "                        <div class=\"name\">\r\n"
					+ "                            <span id=\"FIELD_FNAM\"></span>\r\n"
					+ "                            <span id=\"FIELD_LNAM\">" + datosPersona.getNombre_completo() + "</span>\r\n"
					+ "                        </div>\r\n"
					+ "                        \r\n"
					+ "                    </div><div class=\"doc-overlay para-overlay\" style=\"left:-37px; right: -37px;\"><span class=\"badge badge-primary badge-edit\"></span><span>&nbsp;</span></div></div></div></div></div><div class=\"doc-overlay section-overlay\" style=\"left:-37px; right: -37px;\"><span>&nbsp;</span></div></div></div><div data-react-beautiful-dnd-draggable=\"6\" class=\"sortable-item section-container SortableItem-sibling data-SUMM\"><div class=\"document-tool sec-tool\" id=\"editIcons\" style=\"right: -37px;\"><button class=\"btn btn-icon-tertiary btn-icon-edit\" type=\"button\" title=\"Editar\"><i class=\"icon-edit\"></i></button><button class=\"btn  btn-icon-tertiary btn-icon-delete\" type=\"button\" title=\"Eliminar\"><i class=\"icon-delete\" title=\"Eliminar\"></i></button></div><div id=\"SECTION_SUMMa01262a0-dc98-4479-a02f-4d2da10a62e5\" class=\"section notdraggable summary SECTION_SUMM  noparagraph  \" data-section-cd=\"SUMM\"><div class=\" doc-item\"><div class=\"\"><div class=\"\"><div id=\"PARAGRAPH_SUMM_0\" class=\"paragraph PARAGRAPH_SUMM firstparagraph placeholder-text \"><div class=\"clearfix doc-item\">\r\n"
					+ "                        <div class=\"singlecolumn\" id=\"FIELD_FRFM\">" + datosPersona.getDescripcion() + "</div>\r\n"
					+ "                    </div><div class=\"doc-overlay para-overlay\" style=\"left:-37px; right: -37px;\"><span class=\"badge badge-primary badge-edit\"></span><span>&nbsp;</span></div></div></div></div></div><div class=\"doc-overlay section-overlay\" style=\"left:-37px; right: -37px;\"><span>&nbsp;</span></div></div></div></div></div><div id=\"CONTAINER_PARENT_1\" class=\"parentContainer\"><div id=\"CONTAINER_2\" class=\"left-box\"><div data-react-beautiful-dnd-draggable=\"7\" class=\"sortable-item section-container SortableItem-sibling data-CNTC\"><div class=\"document-tool sec-tool\" id=\"editIcons\" style=\"right: -37px;\"><button class=\"btn btn-icon-tertiary btn-icon-edit\" type=\"button\" title=\"Editar\"><i class=\"icon-edit\"></i></button></div><div id=\"SECTION_CNTCa9118725-a10f-4bc0-a383-5fe5013eaab1\" class=\"section SECTION_CNTC notdraggable    has-title \" data-section-cd=\"CNTC\"><div class=\" doc-item\"><div class=\"heading\"><div class=\"sectiontitle\" id=\"SECTIONNAME_CNTC\">Contacto<span title=\"Contacto \" class=\"rename-section text-rename\"></span></div></div><div class=\"\"><div class=\"\"><div id=\"PARAGRAPH_CNTC_a3d726a0-a03a-4391-994e-ed7833eab959\" class=\"paragraph PARAGRAPH_CNTC firstparagraph  \"><div class=\"clearfix doc-item\">\r\n"
					+ "                        <div class=\"address\">\r\n"
					+ "                            \r\n"
					+ "                            \r\n"
					+ "                            <div class=\"iconRow\" dependency=\"EMAI\">\r\n"
					+ "                                <div class=\"iconSvg\">\r\n"
					+ "                                    <svg width=\"15px\" height=\"15px\" viewBox=\"0 0 15 15\"><path fill=\"#343b40\" d=\"M7.519 6.11c-.316 0-.611.13-.851.371-.283.283-.458.686-.458 1.166 0 .676.426 1.058 1.025 1.058.305 0 .6-.131.829-.36.283-.283.469-.719.469-1.211 0-.621-.425-1.024-1.014-1.024\"></path><path fill=\"#343b40\" d=\"M14.327 0c.416 0 .753.338.753.754v13.573a.753.753 0 0 1-.753.753H.754A.754.754 0 0 1 0 14.327V.754C0 .338.338 0 .754 0h13.573m-4.192 9.83c1.2 0 2.17-.916 2.17-2.737 0-2.235-2.082-4.317-4.754-4.317a4.773 4.773 0 0 0-4.775 4.775c0 2.606 2.071 4.754 4.862 4.754a5.352 5.352 0 0 0 2.891-.817l-.219-.349c-.818.48-1.592.731-2.672.731-2.573 0-4.405-1.92-4.405-4.319 0-2.388 1.854-4.34 4.318-4.34 2.454 0 4.297 1.865 4.297 3.882 0 1.45-.611 2.225-1.386 2.225-.501 0-.796-.295-.796-.687 0-.088.012-.229.033-.338l.512-2.933-1.286-.208-.12.578c-.305-.414-.752-.741-1.504-.741-1.276 0-2.443 1.199-2.443 2.737 0 1.297.883 2.104 1.995 2.104.709 0 1.243-.316 1.614-.654.272.316.785.654 1.668.654\"></path></svg>\r\n"
					+ "                                </div>\r\n"
					+ "                                <div class=\"icoTxt\">\r\n"
					+ "                                    <span id=\"FIELD_EMAI\">" + datosPersona.getCorreo() + "</span>\r\n"
					+ "                                </div>\r\n"
					+ "                            </div>\r\n"
					+ "                        </div>\r\n"
					+ "                        \r\n"
					+ "                    </div><div class=\"doc-overlay para-overlay\" style=\"left:-37px; right: -37px;\"><span class=\"badge badge-primary badge-edit\"></span><span>&nbsp;</span></div></div></div></div></div><div class=\"doc-overlay section-overlay\" style=\"left:-37px; right: -37px;\"><span>&nbsp;</span></div></div></div><div data-react-beautiful-dnd-draggable=\"7\" class=\"sortable-item section-container SortableItem-sibling data-HILT\"><div class=\"document-tool sec-tool\" id=\"editIcons\" style=\"right: -37px;\"><button class=\"btn btn-icon-tertiary btn-icon-edit\" type=\"button\" title=\"Editar\"><i class=\"icon-edit\"></i></button><button class=\"btn  btn-icon-tertiary btn-icon-delete\" type=\"button\" title=\"Eliminar\"><i class=\"icon-delete\" title=\"Eliminar\"></i></button><button type=\"button\" class=\"btn-icon-tertiary btn-icon-move\" style=\"right: -114px;\"><i class=\"icon-move\" tabindex=\"0\" data-react-beautiful-dnd-drag-handle=\"7\" aria-roledescription=\"Draggable item. Press space bar to lift\" draggable=\"false\" title=\"Mover\"></i></button></div><div id=\"SECTION_HILT25419c4d-53be-4f9c-b47a-77b8c25a3a84\" class=\"section SECTION_HILT    has-title \" data-section-cd=\"HILT\"><div class=\" doc-item\"><div class=\"heading\"><div class=\"sectiontitle\" id=\"SECTIONNAME_HILT\">Aptitudes<span title=\"Aptitudes \" class=\"rename-section text-rename\"></span></div></div><div class=\"\"><div class=\"\"><div id=\"PARAGRAPH_HILT_0daadd2b-69a1-0e72-500e-05a72d62f7f7\" class=\"paragraph PARAGRAPH_HILT firstparagraph  \"><div class=\"clearfix doc-item\">\r\n"
					+ "                        <div class=\"singlecolumn maincolumn\">\r\n"
					+ "                            <span class=\"paddedline inner-field\" id=\"FIELD_SKC1\"><ul><li>" + datosPersona.getAptitud_1() + "</li>\r\n"
					+ "<li>" + datosPersona.getAptitud_2() + "</li></ul></span>\r\n"
					+ "                            <span class=\"paddedline\" id=\"FIELD_SKC2\"><ul><li>" + datosPersona.getAptitud_3() + "</li></ul></span>\r\n"
					+ "                        </div>\r\n"
					+ "                    </div><div class=\"doc-overlay para-overlay\" style=\"left:-37px; right: -37px;\"><span class=\"badge badge-primary badge-edit\"></span><span>&nbsp;</span></div></div></div></div></div><div class=\"doc-overlay section-overlay\" style=\"left:-37px; right: -37px;\"><span>&nbsp;</span></div></div></div></div><div id=\"CONTAINER_3\" class=\"right-box\"><div data-react-beautiful-dnd-draggable=\"7\" class=\"sortable-item section-container SortableItem-sibling data-EDUC\"><div class=\"document-tool sec-tool\" id=\"editIcons\" style=\"right: -37px;\"><button class=\"btn btn-icon-tertiary btn-icon-edit\" type=\"button\" title=\"Editar\"><i class=\"icon-edit\"></i></button><button class=\"btn  btn-icon-tertiary btn-icon-delete\" type=\"button\" title=\"Eliminar\"><i class=\"icon-delete\" title=\"Eliminar\"></i></button><button type=\"button\" class=\"btn-icon-tertiary btn-icon-move\" style=\"right: -114px;\"><i class=\"icon-move\" tabindex=\"0\" data-react-beautiful-dnd-drag-handle=\"7\" aria-roledescription=\"Draggable item. Press space bar to lift\" draggable=\"false\" title=\"Mover\"></i></button></div><div id=\"SECTION_EDUCdf1d4d00-84d5-4592-b242-00dfeb02ecc2\" class=\"section education SECTION_EDUC  noparagraph multi-para has-title \" data-section-cd=\"EDUC\"><div class=\" doc-item\"><div class=\"heading\"><div class=\"sectiontitle\" id=\"SECTIONNAME_EDUC\">Formación<span title=\" Formación \" class=\"rename-section text-rename\"></span></div></div><div class=\"\"><div class=\"\"><div id=\"PARAGRAPH_EDUC_0\" class=\"paragraph PARAGRAPH_EDUC firstparagraph placeholder-text \"><div class=\"clearfix doc-item\">\r\n"
					+ "                        <div class=\"singlecolumn\">\r\n"
					+ "                            <div class=\"paddedline\" dependency=\"DGRE|GRYR|GRIP|STUY|GRST|GRED\">\r\n"
					+ "                                <span class=\"degree txt-bold\" id=\"FIELD_DGRE\">" + datosFormacion.getTipo() + "</span><span dependency=\"DGRE+STUY\"> : </span><span class=\"programline\" id=\"FIELD_STUY\">" + datosFormacion.getNombre_titulación() + "</span><span dependency=\"DGRE|STUY\"><span dependency=\"GRYR\">, </span></span>\r\n"
					+ "                                <span class=\"xslt_static_change displayNoneThisField\">Fecha prevista de finalización </span><span id=\"FIELD_GRYR\" format=\"%m/%Y\">" + datosFormacion.getAño_finalizacion() + "</span>\r\n"
					+ "                                \r\n"
					+ "                            </div>\r\n"
					+ "                            <div class=\"paddedline\" dependency=\"SCIT|SSTA|SCHO|SCNT\">\r\n"
					+ "                                <span class=\"companyname txt-bold\" id=\"FIELD_SCHO\">" + datosFormacion.getNombre_institucion() + "</span>\r\n"
					+ "                                <span dependency=\"SCHO\"><span dependency=\"SCIT|SSTA|SCNT\"> - </span></span>\r\n"
					+ "                                <span class=\"joblocation jobcity\" id=\"FIELD_SCIT\"></span>\r\n"
					+ "                                <span class=\"joblocation jobstate\" id=\"FIELD_SSTA\">" + datosFormacion.getCiudad_institucion() + "</span><span class=\"joblocation jobcountry\" id=\"FIELD_SCNT\"></span>\r\n"
					+ "                            </div>\r\n"
					+ "                            \r\n"
					+ "                            <span class=\"jobline\" id=\"FIELD_FRFM\"></span>\r\n"
					+ "                        </div>\r\n"
					+ "                    </div><div class=\"doc-overlay para-overlay\" style=\"left:-37px; right: -37px;\"><span class=\"badge badge-primary badge-edit\"></span><span>&nbsp;</span></div></div></div></div></div><div class=\"doc-overlay section-overlay\" style=\"left:-37px; right: -37px;\"><span>&nbsp;</span></div></div></div><div data-react-beautiful-dnd-draggable=\"7\" class=\"sortable-item section-container SortableItem-sibling data-EXPR\"><div class=\"document-tool sec-tool\" id=\"editIcons\" style=\"right: -37px;\"><button class=\"btn btn-icon-tertiary btn-icon-edit\" type=\"button\" title=\"Editar\"><i class=\"icon-edit\"></i></button><button class=\"btn  btn-icon-tertiary btn-icon-delete\" type=\"button\" title=\"Eliminar\"><i class=\"icon-delete\" title=\"Eliminar\"></i></button><button type=\"button\" class=\"btn-icon-tertiary btn-icon-move\" style=\"right: -114px;\"><i class=\"icon-move\" tabindex=\"0\" data-react-beautiful-dnd-drag-handle=\"7\" aria-roledescription=\"Draggable item. Press space bar to lift\" draggable=\"false\" title=\"Mover\"></i></button></div><div id=\"SECTION_EXPR7060cf1e-2f93-4a31-98db-ac0b099c2575\" class=\"section SECTION_EXPR   multi-para has-title \" data-section-cd=\"EXPR\"><div class=\" doc-item\"><div class=\"heading\"><div class=\"sectiontitle\" id=\"SECTIONNAME_EXPR\">Historial laboral<span title=\" Historial laboral \" class=\"rename-section text-rename\"></span></div></div><div class=\"\"><div class=\"\"><div id=\"PARAGRAPH_EXPR_adc0fd4f-c602-800d-ef1a-bb9c71ba23ab\" class=\"paragraph PARAGRAPH_EXPR firstparagraph  \"><div class=\"clearfix doc-item\">\r\n"
					+ "                        <div class=\"singlecolumn\">\r\n"
					+ "                            <span class=\"paddedline\" dependency=\"JTIT|JSTD|EDDT\">\r\n"
					+ "                                <span class=\"jobtitle txt-bold txtCaps\" id=\"FIELD_JTIT\">" + datosPuesto.getNombre_puesto() + "</span>\r\n"
					+ "                                <span class=\"flt-right\" dependency=\"JSTD|EDDT\">\r\n"
					+ "                                    <span class=\"jobdates\" id=\"FIELD_JSTD\" format=\"%m/%Y\">" + datosPuesto.getAño_inicio() + "</span><span dependency=\"JSTD+EDDT\"> - </span>\r\n"
					+ "                                    <span class=\"jobdates\" id=\"FIELD_EDDT\" format=\"%m/%Y\">Actual</span><br dependency=\"JSTD|EDDT\">\r\n"
					+ "                                </span>\r\n"
					+ "                            </span>\r\n"
					+ "                            <span class=\"paddedline locationGap\" dependency=\"COMP|JSTA|JCIT|JCNT\">\r\n"
					+ "                                <span class=\"companyname txt-bold\" id=\"FIELD_COMP\">" + datosPuesto.getNombre_empleador() + "</span><span dependency=\"COMP\"><span dependency=\"JCIT|JSTA|JCNT\"> - </span></span>\r\n"
					+ "                                <span class=\"jobcity\" id=\"FIELD_JCIT\">" + datosPuesto.getCiudad() + "</span><span dependency=\"JCIT+JSTA|JCNT\">, </span>\r\n"
					+ "                                <span class=\"jobstate\" id=\"FIELD_JSTA\">" + datosPuesto.getComunidad_autonoma() + "</span><span class=\"joblocation jobcountry\" id=\"FIELD_JCNT\"></span>\r\n"
					+ "                            </span>\r\n"
					+ "\r\n"
					+ "                            <span class=\"jobline\" id=\"FIELD_JDES\"><ul>\r\n"
					+ "  <li>" + datosPuesto.getActividad_1() + "</li>\r\n"
					+ "  <li>" + datosPuesto.getActividad_2() + "</li>\r\n"
					+ "  <li>" + datosPuesto.getActividad_3() + "</li>\r\n"
					+ "</ul></span>\r\n"
					+ "                        </div>\r\n"
					+ "                    </div><div class=\"doc-overlay para-overlay\" style=\"left:-37px; right: -37px;\"><span class=\"badge badge-primary badge-edit\"></span><span>&nbsp;</span></div></div></div></div></div><div class=\"doc-overlay section-overlay\" style=\"left:-37px; right: -37px;\"><span>&nbsp;</span></div></div></div></div></div></div><div></div></div></div></div></div></div>\r\n"
					+ "</body>\r\n"
					+ "</html>\r\n"
					+ "");
			
			System.out.println("Se ha modificado el archivo.");
			
			bw.close();
		} catch (IOException e) {
			System.out.println("Error en generarCurriculumEnHTML:" + e);
		}
	}

}
