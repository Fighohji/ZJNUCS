#! /usr/bin/env python
#coding=utf-8
from fpdf import FPDF

pdf = FPDF()
pdf.add_page()
pdf.set_font('Arial', 'B', 16)
pdf.cell(40, 10, 'Hello World!')
#pdf.cell(60, 10, 'Powered by FPDF.', 0, 1, 'C')
pdf.output('tuto1.pdf', 'F')
