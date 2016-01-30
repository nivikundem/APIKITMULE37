%dw 1.0
%output application/java
---
[{
	Message: "<?xml version='1.0' encoding='UTF-8'?>
<VBLoad>
  <DateGenerated>07-01-2016</DateGenerated>
  <VBLoadList>
    <VB VBR=\"100\">
      <VRN>A100</VRN>
      <DateBooked>01-01-2016</DateBooked>
      <TimeBooked>09:15</TimeBooked>
      <Amount>20.00</Amount>
      <Source>JSON</Source>
      <Target>REST</Target>
    </VB>
  </VBLoadList>
</VBLoad>
"
}]