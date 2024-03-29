<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@include file="../includes/header.jsp"%>

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">Board Register</h1>
	</div>
	<!-- /.clo-lg-12 -->
</div>
<!-- /.row -->

<div class="row">
	<div class="col-lg-12">
		<h1 class="page-header">Board Read</h1>
	</div>
	<!-- col-lg-12 -->
</div>
<!-- /.row -->

<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default">

			<div class="panel-heading">Board Read</div>
			<!-- /.pannel-heading -->
			<div class="panel-body">

				<div class="form-group">
					<label>Bno</label> <input class="form-control" name="bno"
						value="<c:out value="${board.bno }"/>" readonly="readonly">
				</div>

				<div class="form-group">
					<label>Title</label><input class="form-control" name="title"
						value="<c:out value="${board.title }"/>" readonly="readonly">
				</div>

				<div class="form-group">
					<label>Text area</label> <textarea class="form-control" rows="3" name="content" readonly="readonly">
					
					</textarea><input class="form-control" name="writer">
				</div>
				<button type="submit" class="btn btn-default">Submit Button</button>
				<button type="reset" class="btn btn-default">Reset Button</button>
				</form>
			</div>
			<!-- end panel-body -->
		</div>
		<!-- end pane-body -->
	</div>
	<!-- end panel -->
</div>
<!-- /.row -->
<%@include file="../includes/footer.jsp"%>